package com.sdajava.problems;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionUtils {

    public static <T>LinkedList<T> linkedList(T... elements){   //varargs
        return Stream.of(elements).collect(Collectors.toCollection(LinkedList::new));
    }
}
