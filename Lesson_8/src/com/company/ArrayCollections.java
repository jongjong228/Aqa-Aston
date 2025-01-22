package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayCollections {

    private String[] array;

    public ArrayCollections(String[] array){
        this.array = array;
    }

    public void printUniqueElements(){
        System.out.println("Unique elements of array:");
        for(String element : Stream.of(array).collect(Collectors.toSet())){
            if (Collections.frequency(Arrays.asList(array),element) == 1) {
                System.out.println(element);
            }
        }
    }

    public void printFrequencyOfElements(){
        System.out.println("Elements and their frequency:");
        List<String> list = Arrays.asList(array);
        Set<String> set = Stream.of(array).collect(Collectors.toSet());
        for(String element : set){
            System.out.println(element + ": " + Collections.frequency(list,element));
        }
    }
}
