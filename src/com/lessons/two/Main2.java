package com.lessons.two;


import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;

public class Main2 {
    public static void main(String[] args) {
    completedTask();

    }


    private static void completedTask() {
        System.out.println("\nTask 1");
        task1();

        System.out.println("\nTask 2");
        task2();

        System.out.println("\nTask 3");
        task3();

        System.out.println("\nTask 4 +" +
                           "\nEnter matrix size... ");
        task4(new Scanner(System.in));

        System.out.println("\nTask 5");
        task5();

        System.out.println("\nTask 6");
        task6();

        System.out.println("\nTask 7");
        task7();
    }



    private static void task1() {

        Lesson2_ArrayClass lesson2_arrayClass = new Lesson2_ArrayClass();
        lesson2_arrayClass.createArrayWithSize(9, 0,1);
        System.out.println(lesson2_arrayClass);
        lesson2_arrayClass.inspectorGadget(lesson2_arrayClass.getArrayOfInteger());
        System.out.println(lesson2_arrayClass);

    }

    private static void task2() {
        Lesson2_ArrayClass lesson2_arrayClass = new Lesson2_ArrayClass();
        lesson2_arrayClass.createArrayWithSize(8,0,0);

        int[] array = lesson2_arrayClass.getArrayOfInteger();
        array[0] = 0;
        for(int i = 1; i< array.length; i++) {
            array[i] = array[i-1] + 3;
        }
        System.out.println(Arrays.toString(array));
    }


    private static void task3() {
        Lesson2_ArrayClass lesson2_arrayClass = new Lesson2_ArrayClass();
        lesson2_arrayClass.createArrayWithSize(20,0,12);
        System.out.println(lesson2_arrayClass);

        int[] array = lesson2_arrayClass.getArrayOfInteger();
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6) array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task4(Scanner scanner) {
        int size = scanner.nextInt();

        int[][] matrixE = new int[size][size];
        int i,j = 0;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if(i == j) matrixE[i][j] = 1;
                else matrixE[i][j] = 0;
            }
        }


        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(matrixE[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task5() {
        Lesson2_ArrayClass lesson2_arrayClass = new Lesson2_ArrayClass();
        lesson2_arrayClass.createArrayWithSize(12, -10, 10);
        System.out.println(lesson2_arrayClass);
        MaxMinElements maxmin = lesson2_arrayClass.getMaxElements(lesson2_arrayClass.getArrayOfInteger());
        System.out.println(maxmin);
    }

    private static void task6(){
        Lesson2_ArrayClass lesson2_arrayClass = new Lesson2_ArrayClass();
        lesson2_arrayClass.createArrayWithSize(4, 0 , 10);
        System.out.println(lesson2_arrayClass);
        System.out.println(lesson2_arrayClass.checkBalance(lesson2_arrayClass.getArrayOfInteger()));
        int[] arr = lesson2_arrayClass.getArrayOfInteger();

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = -2;
        System.out.println(Arrays.toString(arr));
        System.out.println(lesson2_arrayClass.checkBalance(arr));
    }

    private static void task7() {
        Lesson2_ArrayClass lesson2_arrayClass = new Lesson2_ArrayClass();
        lesson2_arrayClass.createArrayWithSize(8,0,10);
        System.out.println(lesson2_arrayClass);
        System.out.println("Кэп, крутим по часвой !");
        lesson2_arrayClass.rollerCoaster(lesson2_arrayClass.getArrayOfInteger(), 4);
        System.out.println(lesson2_arrayClass);
        System.out.println("Кэп, ладно идем обратно. Кручу против часовой !");
        lesson2_arrayClass.rollerCoaster(lesson2_arrayClass.getArrayOfInteger(),-4);
        System.out.println(lesson2_arrayClass);
        System.out.println("Все приплыли !");
    }



}
