package se.iths.antonia.dicegame;

public class Player {
    private String firstName;
    private String lastName;
    private int score;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addToScore(int score) {
        this.score += score;

    }

    public String getFullName() {
        return  this.firstName + " " + this.lastName;

    }

    public int getScore() {
        return this.score;

    }
}
