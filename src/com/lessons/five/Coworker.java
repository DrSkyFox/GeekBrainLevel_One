package com.lessons.five;

import java.util.Random;

public class Coworker {
//    * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников



    public String fullName;
    private String position;
    private String email;
    private int numberPhone;
    private int Salary;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
    public Coworker() {
    }

    public Coworker(String fullName) {
        this(fullName, null, null);
    }

    public Coworker(String fullName, String position, String email) {
        this(fullName, position, email, new Random().nextInt(9), new Random().nextInt(), new Random().nextInt(100));
    }

    public Coworker(String fullName, String position, String email, int numberPhone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        Salary = salary;
        this.age = age;
    }

    public void tellMeWhoYou() {
        System.out.println(fullName);
    }

    @Override
    public String toString() {
        return "Coworker{" +
               "fullName='" + fullName + '\'' +
               ", position='" + position + '\'' +
               ", email='" + email + '\'' +
               ", numberPhone=" + numberPhone +
               ", Salary=" + Salary +
               ", age=" + age +
               '}';
    }
}
