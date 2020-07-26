package com.lessons.four;

import java.util.Scanner;

public class Player extends Gamers {

    private Field field;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Player(int playerNum, char markOfPlayer) {
        this.playerNum =playerNum;
        this.markOfPlayer = markOfPlayer;
    }

    public void doTurn() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int xVal = checkingRange("X-value", scanner);
            int yVal = checkingRange("Y-value", scanner);
            if (field.getField()[xVal][yVal] == 0) {
                field.getField()[xVal][yVal] = playerNum;
                break;
            }
        }
    }


    private int checkingRange(String string, Scanner scanner) {

        boolean inRange = false;
        int coord = -1;
        while(!inRange) {
            System.out.println("Please enter " + string + "[1-" + field.getField().length +"]");
            coord = scanner.nextInt();
            if(coord <= field.getField().length && coord > 0) {
                inRange = true;
            }

        }
        return coord-1;
    }



}
