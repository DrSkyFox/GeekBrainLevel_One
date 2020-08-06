package com.lessons.seven;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (n > food) {
            System.out.println("Мало еды на тарелке!");
            return;
        }
        food -= n;
        System.out.println("Кол-во еды осталось: " + food);
    }

    public void info() {
        System.out.println("count food: " + food);
    }

    public void addFood(int food) {
        this.food += food;
        System.out.println("Добавлено еды: "  + food);
    }

    public boolean isEmpty() {
        if(food == 0) {
            return true;
        }
        return false;
    }

}
