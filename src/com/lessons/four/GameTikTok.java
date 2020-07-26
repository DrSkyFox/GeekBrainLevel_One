package com.lessons.four;

import java.util.logging.Logger;

public class GameTikTok {
    Logger logger = Logger.getLogger(GameTikTok.class.getName());
    private static Field field;
    private static Player player;
    private static AIPlayer aiPlayer;


    public static void setPlayer(Player player) {
        GameTikTok.player = player;
    }

    public static void setAiPlayer(AIPlayer aiPlayer) {
        GameTikTok.aiPlayer = aiPlayer;
    }


    public GameTikTok() {
        field = new Field();
    }

    private void defaultSettings() {
        player = new Player(1, 'X');
        aiPlayer = new AIPlayer(2,'Y', player.playerNum);

        player.setField(field);
        aiPlayer.setField(field);

        field.setPlayer(player);
        field.setAiPlayer(aiPlayer);
    }

    public void gameStart() {
        System.out.println("Добро пожаловать в крестики - нолики");
        defaultSettings();
        field.printField();

        while (true) {
            System.out.println("Ходит игрок");
            player.doTurn();
            field.printField();
            if (isWin(field, player.playerNum)) {
                System.out.println("Игрок победил !");
                break;
            }

            if(!draw()) {
                System.out.println("Ничья !");
                break;
            }

            System.out.println("Ходит компьютер");
            aiPlayer.doTurn();
            field.printField();
            if(isWin(field,aiPlayer.playerNum)) {
                System.out.println("Компьютер победил !");
                break;
            }


            if(!draw()) {
                System.out.println("Ничья !");
                break;
            }

        }

    }


    public static boolean isWin(Field field, int playerNum) {

        //главная диагональ матрицы
        if (subChecker(field, 0,0, 1 , 1, playerNum)) return true;
        //обратная диагональ матрицы
        if (subChecker(field, 0, field.getField().length -1, 1, -1, playerNum)) return true;

        for (int i = 0; i < field.getField().length; i++) {
            if (subChecker(field,i,0, 0, 1, playerNum)) return true;
            if (subChecker(field,0, i,1,0, playerNum)) return true;
        }
        return false;
    }

    private static boolean subChecker(Field field, int start_xval, int start_yval, int step_x, int step_y, int iD) {
        for (int i = 0; i < field.getField().length ;i++) {
            if(field.getField()[start_xval + i*step_x][start_yval + i*step_y] !=iD) {
                return false;
            }
        }
        return true;
    }

    private boolean draw() {
        //Можно после 4 раунда проверить на победу игроков в следющем шаге. Если условие не выполниться, то ничья.

        //Если поле полностью заполнено, то ничья
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField().length; j++) {
                if(field.getField()[i][j] ==0){
                    return true;
                }
            }
        }
        return false;
    }


}
