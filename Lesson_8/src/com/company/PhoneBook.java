package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class PhoneBook {

    private Map<String,List<String>> book;
    private List<String> listOfNumbers;

    public PhoneBook(){
        book = new HashMap<>();
        listOfNumbers = new ArrayList<>();
    }

    public void add(String name,String value){
        if(!listOfNumbers.contains(value)) {
            if (!book.containsKey(name)) {
                book.put(name, new ArrayList<>());
            }
            book.get(name).add(value);
            listOfNumbers.add(value);
            System.out.println(name + ":" + value + " added to a book");
        } else System.out.println("The book already contains this phone number!");
    }

    public void get(String name){
        if(book.containsKey(name)) {
            System.out.println(name + "'s phone numbers:");
            Stream.of(book.get(name)).forEach(System.out::println);
        } else System.out.println("Book hasn't phone numbers with such name");
    }
}
