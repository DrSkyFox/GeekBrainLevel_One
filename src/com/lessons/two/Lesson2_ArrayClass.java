package com.lessons.two;

import java.util.ArrayList;
import java.util.Random;

public class Lesson2_ArrayClass {
    /*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
 если в массиве есть место, в котором сумма левой и правой части массива равны.
 Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
 эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n
 (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
 Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */

    private ArrayList<Integer> arrayOfInteger = null;
    private int sizeOfArray = 0;


    //--------------------------------------Constructors
    public Lesson2_ArrayClass(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public Lesson2_ArrayClass() {
    }
    //--------------------------------------Getter and Setter methods
    public ArrayList<Integer> getArrayOfInteger() {
        return arrayOfInteger;
    }

    public void setArrayOfInteger(ArrayList<Integer> arrayOfInteger) {
        this.arrayOfInteger = arrayOfInteger;
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }
    //--------------------------------------Other Methods


    //---------- Create Array
    public void createArrayWithSize(int sizeOfArray,
                            Integer random_range) {

        if(sizeOfArray == 0) {
            sizeOfArray = this.sizeOfArray;
        } else this.sizeOfArray = sizeOfArray;

        if (random_range == null) {
            arrayOfInteger = new ArrayList<>(sizeOfArray);
        } else createArrayNotEmpty(sizeOfArray, random_range);
    }

    private void createArrayNotEmpty(int sizeOfArray,
                                     Integer random_range) {
        Random random = new Random(random_range.intValue());
        arrayOfInteger = new ArrayList<>(sizeOfArray);

        for (int i = 0; i < arrayOfInteger.size()-1; i ++) {
            arrayOfInteger.add(random.nextInt());
        }
    }


    //-----------Check Empty Array
    public boolean isFullEmpty(ArrayList<Integer> arrayOfInteger) {

        boolean checkEmpty = false;

        for (int i = 0; i < arrayOfInteger.size() -1; i++) {
            checkEmpty = checkEmpty | arrayOfInteger.get(i).equals(null);
        }
        return checkEmpty;
    }

    //----------Get Max and Min elements of Array

    public MaxMinElements getMaxElements(ArrayList<Integer> arrayOfInteger) {
        MaxMinElements max = new MaxMinElements(0,0, 0, 0);
        for (int i = 0; i < arrayOfInteger.size()-1; i ++) {
            if (max.getMaxNum() < arrayOfInteger.get(i)) {
                max.setMaxNum(arrayOfInteger.get(i));
                max.setIndexMax(i);
            }
            if(max.getMinNum() > arrayOfInteger.get(i)){
                max.setIndexMin(i);
                max.setMinNum(arrayOfInteger.get(i));
            }
        }
        return max;
    }

    //------------------Inspector Gadget
    public ArrayList<Integer> inspectorGadget (ArrayList<Integer> arrayOfInteger) {
        for (int i = 0; i<arrayOfInteger.size()-1; i++) {
            if (arrayOfInteger.get(i) == 0) {
                arrayOfInteger.set(i,1);
            } else if (arrayOfInteger.get(1) == 1) arrayOfInteger.set(i,0);
            else arrayOfInteger.set(i, -1*arrayOfInteger.get(i));
        }

        return arrayOfInteger;
    }
    //----------------Check Balance
    public boolean checkBalance(ArrayList<Integer> arrayOfInteger) {
        boolean checkBalance = false;
        int size=arrayOfInteger.size();
        if (size % 2 != 0) {

        } else {
            if (sumSubFunction(arrayOfInteger, 0, size/2) == sumSubFunction(arrayOfInteger, size/2, arrayOfInteger.size()))
                checkBalance = true;
        }
        return checkBalance;
    }

    private int sumSubFunction(ArrayList<Integer> arrayOfInteger, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum = sum + arrayOfInteger.get(i);
        }
        return sum;
    }




    @Override
    public String toString() {
        return "Lesson2_ArrayClass{" +
               "arrayOfInteger=" + arrayOfInteger +
               ", sizeOfArray=" + sizeOfArray +
               '}';
    }
}
