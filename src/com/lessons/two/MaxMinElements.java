package com.lessons.two;

public class MaxMinElements {
    private int maxNum;
    private int minNum;
    private int indexMax;
    private int indexMin;


    public MaxMinElements(int maxNum, int minNum, int indexMax, int indexMin) {
        this.maxNum = maxNum;
        this.minNum = minNum;
        this.indexMax = indexMax;
        this.indexMin = indexMin;
    }


    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getIndexMax() {
        return indexMax;
    }

    public void setIndexMax(int indexMax) {
        this.indexMax = indexMax;
    }


    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getIndexMin() {
        return indexMin;
    }

    public void setIndexMin(int indexMin) {
        this.indexMin = indexMin;
    }

    @Override
    public String toString() {
        return "MaxMinElements{" +
               "maxNum=" + maxNum +
               ", minNum=" + minNum +
               ", indexMax=" + indexMax +
               ", indexMin=" + indexMin +
               '}';
    }
}
