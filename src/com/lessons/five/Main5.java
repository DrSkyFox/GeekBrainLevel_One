package com.lessons.five;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        Coworker[] coworkers = createCoworker();
        printCW(coworkers);

        System.out.println(coworkers[2].toString());

    }

    private static Coworker[] createCoworker() {
        Coworker[] coworkers = new Coworker[5];
        coworkers[0] =  new Coworker("Name 1", "hunter", "hunter@game", 798646645, 40000, 20);
        coworkers[1] =  new Coworker("Name 0", "catcher", "cather@game", 123184487, 80000, 30);
        coworkers[2] =  new Coworker("Alice", "Persona5", "curo@shakigami", 459273, 0, 936);
        coworkers[3] =  new Coworker("Zeux", "child", "baby@childgarden", 0, 1, 1);
        coworkers[4] =  new Coworker("Name 1", "hunter", "hunter@game", 798646645, 40000, 20);
        return coworkers;
    }

    private static void printCW(Coworker[] coworkers) {
        for (int i = 0; i < coworkers.length; i++) {
            if(coworkers[i].getAge()>40) {
                System.out.println(coworkers[i].toString());
            }

        }
    }
}
