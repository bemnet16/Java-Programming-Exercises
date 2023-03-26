package DiePlayProject;

import java.util.Random;

public class Die{
    private int side;
    private int value;

    public Die(int numSides){
        side = numSides;
        roll();
    }
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(side) + 1;
    }
    public int getSide(){
        return side;
    }
    public int getValue(){
        return value;
    }
    public void show(Die d){
        System.out.println("this die has  " + side + " sides and  " + d.getSide());
    }
}