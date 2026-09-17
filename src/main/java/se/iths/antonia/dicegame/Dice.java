package se.iths.antonia.dicegame;

import java.util.random.RandomGenerator;

public class Dice {
    public static int rollDice() {
        int diceRoll = RandomGenerator.getDefault().nextInt(1, 7);
        return diceRoll;
    }
}
