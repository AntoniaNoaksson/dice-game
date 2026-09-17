package se.iths.antonia.dicegame;

public class Game {
    public void startGame() {
        Player player1 = createPlayer();
        Player player2 = createPlayer();
        String playAgain = "ja";
        while (playAgain.equals("ja")) {
            rollDice(player1);
            rollDice(player2);
            checkWinner(player1, player2);
            player1.resetScore();
            player2.resetScore();
            playAgain = IO.readln("Vill du spela igen?");
        }
        IO.println("Spelet avslutas");
    }


    public static Player createPlayer() {
        String firstName = "";
        String lastName = "";

        while (firstName.equals("")) {
            try {
                IO.println("Vänligen skriv ditt förnamn :");
                firstName = IO.readln();

                if (firstName.equals("")) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                IO.println("Namnet får inte vara tomt ");
            }
        }
        while (lastName.equals("")) {
            try {
                IO.println("Vänligen skriv ditt efternamn: ");
                lastName = IO.readln();

                if (lastName.equals("")) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                IO.println("Efternamnet får inte vara tomt ");

            }
        }
        return new Player(firstName, lastName);
    }


    public static void rollDice(Player player) {
        for (int i = 0; i < 2; i++) {
            int diceRoll = Dice.rollDice();
            player.addToScore(diceRoll);
            IO.println(player.getFullName() + " slog :" + diceRoll);
        }
        IO.println(player.getFullName() + " totala poäng : " + player.getScore());
    }

    public static void checkWinner(Player player1, Player player2) {
        if (player1.getScore() > player2.getScore()) {
            IO.println("Vinnare av spelet är :" + player1.getFullName());
        } else if (player1.getScore() == player2.getScore()) {
            IO.println("Det blev lika i spelet");
        } else {
            IO.println("Vinnaren av spelet är : " + player2.getFullName());
        }

    }

}


