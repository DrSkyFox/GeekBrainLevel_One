package com.lessons.seven;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean eat(Plate p) {
        if (appetite > p.getFood()) {
            System.out.println("Нужно больше еды!");
            satiety = false;
            return false;
        }
        p.decreaseFood(appetite);
        System.out.println(name + " покушал на " + appetite);
        satiety = true;
        return true;
    }
}
