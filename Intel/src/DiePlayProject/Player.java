package DiePlayProject;

import java.util.Random;

public class Player {
    private String name;
    private String guess;
    private int point;

    public Player(String playername){
        name = playername;
        guess = "";
        point = 0;
    }
    public void makeGuess(){
        Random rand = new Random();
        int ges = rand.nextInt(2);

        if(ges == 0)
            guess = "Cho";
        else
            guess = "Han";
    }
    public void addPoints(int newpoints){
        point += newpoints;
    }
    public String getName(){
        return name;
    }
    public String getGuess(){
        return guess;
    }
    public int getPoint(){
        return point;
    }
}
