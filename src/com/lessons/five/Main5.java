package com.lessons.five;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Coworker> coworkers = new ArrayList<>();
        coworkers.add(new Coworker("Name 1", "hunter", "hunter@game", 798646645, 40000, 20));
        coworkers.add(new Coworker("Name 0", "catcher", "cather@game", 123184487, 80000, 30));
        coworkers.add(new Coworker("Alice", "Persona5", "curo@shakigami", 459273, 0, 936));
        coworkers.add(new Coworker("Zeux", "child", "baby@childgarden", 0, 1, 1));
        coworkers.add(new Coworker("Name 1", "hunter", "hunter@game", 798646645, 40000, 20));

        coworkers.get(1).tellMeWhoYou();


        for (int i = 0; i < coworkers.size(); i++) {
            if(coworkers.get(i).getAge()<30) {
                System.out.println(coworkers.get(i).toString());
            }

        }
    }
}
