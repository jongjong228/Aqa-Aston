package com.company;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName,String position, String email, String phoneNumber,double salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(){
        this.fullName = "Unknown";
        this.position = "Unknown";
        this.email = "Unknown";
        this.phoneNumber = "Unknown";
        this.salary = 0;
        this.age = 0;
    }

    public void showInfo(){
        System.out.println("Работник:" + this.fullName + ",на позиции:" + this.position + ". Email:" + this.email);
        System.out.println("Телефон для связи:" + this.phoneNumber + ". Заработная плата:" + this.salary + ", возраст:" + this.age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
