package com.lessons.six;

import java.util.Random;

public abstract class Animal{
    protected String name;
    protected double distanceJump;
    protected double distanceSwim;
    protected double distanceRun;
    protected double distanceSwimPass;
    protected double distanceRunPass;

    public Animal(String name, double distanceJump, double distanceSwim, double distanceRun) {
        this.name = name;
        this.distanceJump = distanceJump;
        this.distanceSwim = distanceSwim;
        this.distanceRun = distanceRun;
    }

    protected void buffAnimal() {
        this.distanceJump = buffParam(this.distanceJump, 1);
        this.distanceRun = buffParam(this.distanceRun, 300);
        this.distanceSwim =  buffParam(this.distanceSwim, 10);
    }

    private double buffParam(double param, int coeff) {
        Random buffAnimal = new Random();
        param = param + Math.pow(-1.0, buffAnimal.nextInt(1)) * buffAnimal.nextDouble() * coeff;
        if(param < 0.0) {
            param = 0;
        }
        return param;
    }

    protected boolean swim(double distance, String petName) {
        boolean didIt = false;
        if(distance<this.distanceSwim && distance <= (this.distanceSwim - this.distanceSwimPass)) {
            this.distanceSwimPass = this.distanceSwimPass + distance;
            System.out.println(petName+" проплыла: " + distance + " м!");
            didIt = true;
        } else if (this.distanceSwim == 0 ){
            System.out.println(petName+" не умеет плавать");
        } else {
            System.out.println(petName+" начала плыть, но не доплыла. Пройденная дистанция: " + (this.distanceSwim-this.distanceSwimPass) );
        }
        return didIt;
    }

    protected boolean run(double distance, String petName) {
        boolean didIt = false;
        if(distance<this.distanceRun && distance <= (this.distanceRun - this.distanceRunPass)) {
            System.out.println(petName+" пробежала: " + distance + " м!");
            this.distanceRunPass = this.distanceRunPass + distance;
            didIt = true;
        } else if (this.distanceRun == 0 ){
            System.out.println(petName+" не может бегать");
        } else {
            System.out.println(petName+" начала бежать, но не добежала. Пройденная дистанция: " + (this.distanceRun-this.distanceRunPass) );
        }

        return didIt;
    }

    protected boolean jump(double distance, String petName) {
        boolean didIt = false;
        if(distance<this.distanceJump) {
            System.out.println(petName+" прагнула: " + distance + " м!");
            didIt = true;
        } else if (this.distanceSwim == 0 ){
            System.out.println(petName+" не хочет прагыть");
        } else {
            System.out.println(petName+" не может прыгнуть так высоко!");
        }
        return didIt;
    }

    @Override
    public String toString() {
        return "Name= " + name +
               ", distanceJump= " + distanceJump +
               ", distanceSwim= " + distanceSwim +
               ", distanceRun= " + distanceRun +
               '}';
    }
}
