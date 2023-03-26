package DiePlayProject;

public class Dealar {
    private int die1value;
    private int die2value;

    public Dealar(){
        die1value = 0;
        die2value = 0;
    }
    public void rollDice(){
        final int s = 6;

        Die die1 = new Die(s);
        Die die2 = new Die(s);

        die1value = die1.getValue();
        die2value = die2.getValue();
    }
    public String getChoOrHan(){
        String result;

        if((die1value + die2value) % 2 == 0)
            result = "Cho";
        else
            result = "Han";
        return result;
    }
    public int getDie1value(){
        return die1value;
    }
    public int getDie2value(){
        return die2value;
    }
}
