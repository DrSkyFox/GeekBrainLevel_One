package com.lessons.six;

public class Main6 {


    public static void main(String[] args) {
        Cat cat = new Cat("Mew", true);
        Cat cat1 = new Cat("Mow");
        Dog dog = new Dog("Chappi", true);


        cat1.toSwim(0.1);
        cat.toSwim(0.1);
        dog.toRun(300);

    }

}
