package com.lessons.one;

public class Lesson {
    //class for homework1
    private final byte aByte;
    private final short aLong;
    private final int anInt;
    private final float aFloat;
    private final double aDouble;
    private final char aChar;
    private final boolean aBoolean;


    public Lesson(byte aByte, short aLong, int anInt, float aFloat, double aDouble, char aChar, boolean aBoolean) {
        this.aByte = aByte;
        this.aLong = aLong;
        this.anInt = anInt;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
        this.aChar = aChar;
        this.aBoolean = aBoolean;
    }



    @Override
    public String toString() {
        return "Lessons1{" +
               "aByte=" + aByte +
               ", aLong=" + aLong +
               ", anInt=" + anInt +
               ", aFloat=" + aFloat +
               ", aDouble=" + aDouble +
               ", aChar=" + aChar +
               ", aBoolean=" + aBoolean +
               '}';
    }

    public void sum() throws Exception {

    }
    public static  <T extends Number> T sum(T t1, T t2) throws Exception {

        if (t1.getClass() != t2.getClass()) {
            throw new Exception("t1 and t2 is different classes... dont want work...");
        }

        if (t1.getClass() == Byte.class) {
            return (T) Byte.valueOf((byte) (t1.byteValue() + t2.byteValue()));
        }
        if (t1.getClass() == Short.class) {
            return (T) Short.valueOf((short) (t1.shortValue() + t2.shortValue()));
        }
        if (t1.getClass() == Long.class) {
            return (T) Long.valueOf((t1.longValue() + t2.longValue()));
        }
        if(t1.getClass() == Integer.class) {
            return (T) Integer.valueOf((t1.intValue() + t2.intValue()));
        }
        if(t1.getClass() == Float.class) {
            return (T) Float.valueOf((t1.floatValue() + t2.floatValue()));
        }
        if (t1.getClass() == Double.class) {
            return (T) Double.valueOf((t1.doubleValue() + t2.doubleValue()));
        }
        return null;
    }



}
