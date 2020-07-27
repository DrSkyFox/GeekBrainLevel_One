package com.lessons.five;

public class Coworker {
//    * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников



    String fullName;
    String position;
    String email;
    int numberPhone;
    int Salary;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
