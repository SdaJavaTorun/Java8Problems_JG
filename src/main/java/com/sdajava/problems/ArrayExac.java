package com.sdajava.problems;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


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
        List<T> lista = new ArrayList<T>(elements);
        if (lista.size() == 1) {
            return lista.get(0);
        }
            lista.remove(0);
        return lastRecursion(lista);
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
        return lista.stream().distinct().collect(toList());
    }
    public static <T> List<T> duplicates(List<T> lista, int a) {
        List<T> lista2 = new ArrayList<T>();

        for(T p:lista){
            for (int i = 0; i < a; i++){
                lista2.add(p);
            }
        }
        return lista2;
    }
    public static <T> List<T> duplicatesStream(List<T> lista, int a) {
        return lista.stream().flatMap(e -> Collections.nCopies(a, e).stream()).collect(toList());
    }

    public static <T> List<T> dropEveryNth(List<T> lista, int a){
        /* List<T> list2 = new ArrayList<T>();
        int i = 1;
        for (T p: lista){
            if (i % a != 0) {
                list2.add(p);
            }
            i++;
        }
       return list2; */

     return lista.stream().filter(e -> ((lista.indexOf(e)+1) % a != 0) ).collect(toList());

    }

}
