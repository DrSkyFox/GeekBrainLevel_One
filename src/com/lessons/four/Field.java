package com.lessons.four;

import java.io.File;
import java.util.List;

public class Field {


    private int[][] field;
    private static final char defNullField = '-';

    private Player player;
    private AIPlayer aiPlayer;


    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setAiPlayer(AIPlayer aiPlayer) {
        this.aiPlayer = aiPlayer;
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }

    public Field() {
        createField();
    }


    public void createField() {
        field = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
    }

    public void printField() {
        StringBuilder str;

        for (int i = 0; i < field.length; i++) {
            str = new StringBuilder();
            for (int j = 0; j < field.length; j++) {
                str.append("| ");
                str.append(checkBoxField(field[i][j]));
                str.append(" |");
            }
            System.out.println(str.toString());
            subPrint(str.toString());
        }
    }

    private String checkBoxField(int box) {
        if (box == 2) {
            return String.valueOf(aiPlayer.markOfPlayer);
        }
        if (box == 1) {
            return String.valueOf(player.markOfPlayer);
        }
        return "-";
    }

    private void subPrint(String s) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            tmp.append('-');
        }
        System.out.println(tmp.toString());
    }



}
