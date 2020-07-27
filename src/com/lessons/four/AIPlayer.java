package com.lessons.four;

import com.lessons.three.Game;

import java.util.Random;
import java.util.logging.Logger;

public class AIPlayer extends Gamers{
    Logger logger = Logger.getLogger(AIPlayer.class.getName());

    private int enemyPlayerNum;
    private Field field;


    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public AIPlayer(int playerNum, char markOfPlayer, int enemyPlayerNum) {
        this.enemyPlayerNum = enemyPlayerNum;
        this.playerNum = playerNum;
        this.markOfPlayer = markOfPlayer;
    }

    public void setEnemyPlayerNum(int enemyPlayerNum) {
        this.enemyPlayerNum = enemyPlayerNum;
    }

    private class CoordVal {
        public int xVal;
        public int yVal;

        public CoordVal(int xVal, int yVal) {
            this.xVal = xVal;
            this.yVal = yVal;
        }
    }
    private CoordVal coordVal = new CoordVal(0,0);


    @Override
    public void doTurn() {

        if(!playerCanWin()) {
            markTheBox();
        } else {
            field.getField()[coordVal.xVal][coordVal.yVal] = playerNum;
        }
    }

    private void markTheBox() {
        Random random = new Random();
        int xVal;
        int yVal;
        do {
            xVal = random.nextInt(field.getField().length);
            yVal = random.nextInt(field.getField().length);
        } while(field.getField()[xVal][yVal] != 0);
        field.getField()[xVal][yVal] = playerNum;
    }

    private boolean playerCanWin() {
        boolean status = false;
        boolean check = false;
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField().length; j++) {
                if(field.getField()[i][j] == 0) {
                    field.getField()[i][j] = enemyPlayerNum;
                    check = GameTikTok.isWin(field,enemyPlayerNum);
                    if(check) {
                        coordVal.xVal = i;
                        coordVal.yVal = j;
                        status =true;
                    }
                    field.getField()[i][j] = 0;

                }
            }
        }
    return status;
    }



}
