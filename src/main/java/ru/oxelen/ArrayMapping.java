package ru.oxelen;

import java.util.function.Function;

public class ArrayMapping {
    public static <T> T[] arrayMapping(T[] array, Function<T, T> mapper) {
        for (int i = 0; i < array.length; i++) {
            array[i] = mapper.apply(array[i]);
        }

        return array;
    }
}