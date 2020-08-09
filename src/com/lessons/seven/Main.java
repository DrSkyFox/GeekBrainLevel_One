package com.lessons.seven;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cat> cats = new ArrayList<>();
        Plate plate = new Plate(new Random().nextInt(100));

        System.out.println("Сколько котов нам необходимо? ");
        int len = scanner.nextInt();

        System.out.println("На каждом круге будет добавалятся еда, а возможно и нет. Сколько хотим добавлять ?");
        int max_f = scanner.nextInt();

        for (int i = 0; i < len; i++) {
            cats.add(new Cat(("Cat #"+ (i+1)), new Random().nextInt(20)));
        }

        eatingCats(cats, plate, len, max_f);

        System.out.println("Еда закончилась");


    }

    private static void eatingCats(List<Cat> cats, Plate plate, int len, int maxFoodAdd) {
        boolean satiety = false;
        int k = 0;
        do {
            satiety = false;

            for (int i = 0; i < len; i++) {
                System.out.println("------------------------");
                if(cats.get(i).eat(plate)) {
                    satiety = true;
                    System.out.println(satiety);
                }
                else break;
            }

            plate.addFood(addSomeFood(maxFoodAdd));
            if (plate.isEmpty()) {
                break;
            }

            k++;
            if (k > 99) {
                satiety = false;
            }

        } while (satiety);
    }

    private static int addSomeFood(int max_food) {
        Random random = new Random();

        if(random.nextBoolean()) {
            return random.nextInt(max_food);
        }
        return 0;
    }

}
