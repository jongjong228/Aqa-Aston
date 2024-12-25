package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Employee []workers = new Employee[5];
        workers[0] = new Employee("Petrov Ivan Ivanovich",".net dev","dsd@mail.ru","+375296666666", 300.50,18);
        workers[1] = new Employee("Antonov Anton Antonovich","fullstack dev","cdsaa@gmail.com","+375331111111", 500,19);
        workers[2] = new Employee("Sidorov Igor Igorovich","devops","dwadw@inbox.ru","+375252222222", 700, 21);
        workers[3] = new Employee("Larinov Nikita Andreevich","SDET","vanuw@mail.ru","+375333333333", 2000,23);
        workers[4] = new Employee("Selivanau Vitali Alexandrovich","AQA","ndcaiwd@gmail.com","+375444444444", 6000,48);
        workers[1].showInfo();
        //third task
        Park central = new Park("Центральный", LocalTime.of(12,0),LocalTime.of(23,0));
        Park.Attraction funny = central.new Attraction("Карусель",LocalTime.of(12,0),LocalTime.of(20,0), 5.55);
        System.out.println(central.getAttractions().get(0).getName());
    }
}
