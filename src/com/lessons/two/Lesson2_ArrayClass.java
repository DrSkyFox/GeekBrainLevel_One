package com.lessons.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    private int[] arrayOfInteger = null;
    private int sizeOfArray = 0;


    //--------------------------------------Constructors
    public Lesson2_ArrayClass(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public Lesson2_ArrayClass() {
    }
    //--------------------------------------Getter and Setter methods

    public int[] getArrayOfInteger() {
        return arrayOfInteger;
    }

    public void setArrayOfInteger(int[] arrayOfInteger) {
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
                                    int minRangeElement, int maxRangeElement) {

        if(sizeOfArray == 0) {
            sizeOfArray = this.sizeOfArray;
        } else this.sizeOfArray = sizeOfArray;

        if (minRangeElement == 0 && maxRangeElement == 0) {
            arrayOfInteger = new int[sizeOfArray];
        } else createArrayNotEmpty(sizeOfArray, minRangeElement, maxRangeElement);
    }

    private void createArrayNotEmpty(int sizeOfArray,
                                     int minRangeElement, int maxRangeElement) {

        arrayOfInteger = new int[sizeOfArray];

        for (int i = 0; i < arrayOfInteger.length; i ++) {
            arrayOfInteger[i] = (int) (Math.random() * (maxRangeElement - minRangeElement + 1) + minRangeElement);
        }
    }


    //-----------Check Empty Array
    public boolean isFullEmpty(int[] arrayOfInteger) {

        boolean checkEmpty = false;
        boolean currElementIsEmpty = false;
        for (int i = 0; i < arrayOfInteger.length; i++) {
            currElementIsEmpty = arrayOfInteger[i] == 0;
            checkEmpty = checkEmpty | currElementIsEmpty;
        }
        return checkEmpty;
    }

    //----------Get Max and Min elements of Array

    public MaxMinElements getMaxElements(int[] arrayOfInteger) {
        MaxMinElements max = new MaxMinElements(0,0, 0, 0);
        for (int i = 0; i < arrayOfInteger.length; i ++) {
            if (max.getMaxNum() < arrayOfInteger[i]) {
                max.setMaxNum(arrayOfInteger[i]);
                max.setIndexMax(i);
            }
            if(max.getMinNum() > arrayOfInteger[i]){
                max.setIndexMin(i);
                max.setMinNum(arrayOfInteger[i]);
            }
        }
        return max;
    }

    //------------------Inspector Gadget
    public int[] inspectorGadget (int[] arrayOfInteger) {
        for (int i = 0; i<arrayOfInteger.length; i++) {
            if (arrayOfInteger[i] == 0) {
                arrayOfInteger[i] = 1;
            } else if (arrayOfInteger[i] == 1) arrayOfInteger[i] = 0 ;
            else arrayOfInteger[i] = -1*arrayOfInteger[i];
        }

        return arrayOfInteger;
    }
    //----------------Check Balance
    public boolean checkBalance(int[] arrayOfInteger) {
        boolean checkBalance = false;
        int size=arrayOfInteger.length;
        int sum1= sumSubFunction(arrayOfInteger, 0, size/2);
        int sum2= sumSubFunction(arrayOfInteger, size/2, arrayOfInteger.length);
        if (sum1 == sum2)
            checkBalance = true;
        return checkBalance;
    }

    private int sumSubFunction(int[] arrayOfInteger, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum = sum + arrayOfInteger[i];
        }
        return sum;
    }
    //-----------------Roller Coaster

    public int[] rollerCoaster(int[] arrayOfInteger, int step_n) {
        int[] integers = arrayOfInteger;
        if(step_n <0) {
            integers = leftWheel(arrayOfInteger, Math.abs(step_n));
        } else {
            integers = rightWheel(arrayOfInteger, step_n);
        }
        return integers;
    }

    private int[] leftWheel(int[] arrayOfInteger,int step_n) {
        int tmp = 0;
        int i,j =0;
        for (i = 0; i<step_n; i++) {
            tmp = arrayOfInteger[0];
            for (j = 0; j<arrayOfInteger.length-1; j++) {
                arrayOfInteger[j] = arrayOfInteger[j+1];
            }
            arrayOfInteger[arrayOfInteger.length-1] = tmp;
        }

        return null;
    }

    private int[] rightWheel(int[] arrayOfInteger, int step_n) {
        int tmp = 0;
        int i,j =0;

        for (i = 0; i<step_n; i++) {

            tmp = arrayOfInteger[arrayOfInteger.length-1];
            for (j = arrayOfInteger.length-1; j>0; j--) {
                arrayOfInteger[j] = arrayOfInteger[j-1];
            }
            arrayOfInteger[0] = tmp;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Lesson2_ArrayClass{" +
               "arrayOfInteger=" + Arrays.toString(arrayOfInteger) +
               ", sizeOfArray=" + sizeOfArray +
               '}';
    }
}
