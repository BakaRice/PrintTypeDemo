package com.ricemarch.printtypedemo.utils;

import lombok.NonNull;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Spliterators.spliteratorUnknownSize;

public class StreamUtil {

    /**
     * 指定字段去重
     *
     * @param keyExtractor
     * @param <T>
     * @return
     */
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }


    @SuppressWarnings("OptionalUsedAsFieldOrParameterType")
    public static <T> Stream<T> toStream(Optional<List<T>> list) {
        if (nonNull(list) && list.isPresent()) {
            return toStream(list.get());
        }
        return Stream.of();
    }

    public static <T> Stream<T> toStream(List<T> list) {
        return list == null ? Stream.of() : list.stream();
    }

    @SafeVarargs
    public static <T> Stream<T> toStream(T... array) {
        return array == null ? Stream.of() : Stream.of(array);
    }

    public static <T> Stream<T> toStream(Iterable<T> iterable) {
        return isNull(iterable)
                ? Stream.of()
                : StreamSupport.stream(iterable.spliterator(), false);
    }

    public static <T> Stream<T> toStream(Iterator<T> iterator) {
        return isNull(iterator)
                ? Stream.of()
                : StreamSupport.stream(spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
    }

    public static <T, V> Stream<T> toStream(V v, @NonNull Function<V, Iterable<T>> extractor) {
        if (isNull(v)) {
            return Stream.of();
        }
        return toStream(extractor.apply(v));
    }

    public static <K, V> Stream<Map.Entry<K, V>> toStream(Map<K, V> map) {
        return isNull(map)
                ? Stream.of()
                : toStream(map.entrySet());
    }

    @SafeVarargs
    public static <T> Stream<T> concat(Stream<T>... a) {
        return toStream(a)
                .filter(Objects::nonNull)
                .reduce(Stream::concat)
                .orElseGet(Stream::empty);
    }

    public static <T> Stream<T> concat(Collection<T> a, Collection<T> b) {
        return concat(toStream(a), toStream(b));
    }

    public static <T> Stream<T> concat(Collection<T> a, Collection<T> b, Collection<T> c) {
        return concat(toStream(a), toStream(b), toStream(c));
    }

    @SafeVarargs
    public static <T> Stream<T> concat(Optional<Collection<T>>... a) {
        return toStream(a)
                .filter(Objects::nonNull)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(StreamUtil::toStream)
                .reduce(Stream::concat)
                .orElseGet(Stream::empty);
    }
}
