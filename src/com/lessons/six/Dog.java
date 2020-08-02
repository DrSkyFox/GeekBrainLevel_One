package com.lessons.six;

public class Dog extends Animal {

    private static final double maxDistanceJump = 0.5;
    private static final double maxDistanceSwim = 10;
    private static final double maxDistanceRun = 500;

    public Dog() {
        super(null, maxDistanceJump, maxDistanceSwim, maxDistanceRun);
        System.out.println(toString());

    }

    public Dog(boolean buffedCat) {
        super(null, maxDistanceJump, maxDistanceSwim, maxDistanceRun);
        if (buffedCat) setBuffAnimalRandom();
    }


    public Dog(String name) {
        super(name, maxDistanceJump, maxDistanceSwim, maxDistanceRun);
        System.out.println(toString());
    }

    public Dog(String name, boolean buffedCat) {
        super(name, maxDistanceJump, maxDistanceSwim, maxDistanceRun);
        if (buffedCat) setBuffAnimalRandom();
    }


    public Dog(String name, double distanceJump, double distanceSwim, double distanceRun) {
        super(name, distanceJump, distanceSwim, distanceRun);
        System.out.println(toString());
    }

    public Dog(String name, double distanceJump, double distanceSwim, double distanceRun, boolean buffedCat) {
        super(name, distanceJump, distanceSwim, distanceRun);
        if (buffedCat) setBuffAnimalRandom();
    }


    public void setBuffAnimalRandom() {
        super.buffAnimal();
        System.out.println(getPetName() + " пробафана!");
        System.out.println(toString());
    }

    public boolean toSwim(double distance) {
        return  swim(distance,getPetName());
    }

    public boolean toJump(double distance) {
        return  jump(distance,getPetName());
    }

    public boolean toRun(double distance) {
        return  run(distance,getPetName());
    }

    @Override
    protected boolean swim(double distance, String petName) {
        return super.swim(distance, petName);
    }

    @Override
    protected boolean run(double distance, String petName) {
        return super.run(distance, petName);
    }

    @Override
    protected boolean jump(double distance, String petName) {
        return super.jump(distance, petName);
    }

    private String getPetName() {
        String petName;
        if (this.name != null) {
            petName = this.name;
        } else {
            petName = "Собака";
        }
        return petName;
    }
    @Override
    public String toString() {
        return "Dog{" + super.toString();
    }
}



