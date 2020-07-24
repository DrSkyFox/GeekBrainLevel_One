package com.lessons.three;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main3 {

    public static void main(String[] args) {
        String[] words = {
                "apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic",
                "grape", "melon", "leak",
                "kiwi", "mango", "mushroom",
                "nut", "olive", "pea",
                "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"
        };

        Game.setMaxCapacityWord(15);
        Game game = new Game(words);

        LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.OFF);
        game.startGame();

    }
}
