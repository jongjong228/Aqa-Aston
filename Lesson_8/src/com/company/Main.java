package com.company;

public class Main {

    public static void main(String[] args) {
    //first task
	String[] array = new String[]{"aa","bb","aa","cc","dd","ee","ff","cc","gg","hh","ii","ii","ii"};
    ArrayCollections first = new ArrayCollections(array);
    first.printUniqueElements();
    first.printFrequencyOfElements();
    //second task
    PhoneBook mainBook = new PhoneBook();
    mainBook.add("Ivanov","+375291111111");
    mainBook.add("Devyatov","+375291111112");
    mainBook.add("Ivanov","+375292222222");
    mainBook.add("Petrov","+375291116666");
    mainBook.add("Selivanau","+375291111111");
    mainBook.get("Petrov");
    mainBook.get("Ivanov");
    mainBook.get("Grek");
    }
}
