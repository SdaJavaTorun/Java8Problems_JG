package com.sdajava.problems;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by RENT on 2017-04-01.
 */
public class ArrayExac {

    public static <T> T last(List<T> elements){                // przy statycznych trzab dwa razy zanzaczyć <t> T
        return elements.get(elements.size()-1);
    }
    public static <T> T lastLL(LinkedList<T> elements){
        return elements.getLast();
    }

    public static <T> int length(List<T> elements){
       // if (elements == null)
            //return 0;
        return elements.size();
    }
    public static <T> T lastRecursion(List<T> elements) {
        if (elements.size() == 1) {
            return elements.get(0);
        }
            elements.remove(0);
        return lastRecursion(elements);
    }

    public static <T> List<T> reverse(List<T> lista){
        ArrayList<T> lista2 = new ArrayList<T>();
        for (int i = lista.size()-1 ; i >-1;  i--)
            lista2.add(lista.get(i));
        return lista2;
    }
    public static <T> boolean isPalindrome(List<T> lista) {
        List<T> lista2 = new ArrayList<T>(lista);
        Collections.reverse(lista);
        return Objects.equals(lista, lista2);
    }

    public static <T> List<T> compress(List<T> lista) {
        int suma = 0; int a = lista.size();
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    lista.remove(i);
                    suma++;
                    a = lista.size() - suma;
                }
            }
        }
        return lista;
    }

}
