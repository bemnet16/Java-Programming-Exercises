package DiePlayProject;

import DiePlayProject.Dealar;

import javax.swing.JOptionPane;

public class M {

    public static void main(String[] args) {

        String i;
        final int ma = 5;
        String player1name;
        String player2name;

        i = JOptionPane.showInputDialog("Enter the first player name :");
        player1name = i;
        i = JOptionPane.showInputDialog("Enter the second player name :");
        player2name = i;

        Dealar dealer = new Dealar();
        Player player1 = new Player(player1name);
        Player player2 = new Player(player2name);

        for(int j=0; j < ma; j++){
            JOptionPane.showMessageDialog(null,"------------------------------\n" +
                    String.format(" Now playing round %d.\n",j+1));
            dealer.rollDice();
            player1.makeGuess();
            player2.makeGuess();
            roundResults(dealer,player1,player2);

        }
        displayGrandWinner(player1,player2);
       }

       public static void roundResults(Dealar dealar, Player player1, Player player2){
        JOptionPane.showMessageDialog(null,String.format("The dealar rolled %d and %d : result %s",dealar.getDie1value(), dealar.getDie2value(),dealar.getChoOrHan()));

        checkGuess(player1,dealar);
        checkGuess(player2,dealar);

       }
       public static void checkGuess(Player player, Dealar dealar){
        final int a = 1;
        String gus = player.getGuess();
        String chohan = dealar.getChoOrHan();
        JOptionPane.showMessageDialog(null,String.format("The player %s guessed %s",player.getName(),player.getGuess()));

        if(gus.equalsIgnoreCase(chohan)){
            player.addPoints(a);
            JOptionPane.showMessageDialog(null,String.format("Awarding %d point to %s",a,player.getName()));
        }
       }
       public static void displayGrandWinner(Player player1, Player player2){
        JOptionPane.showMessageDialog(null,"-----------------------------\n" +
                "Game over. Here are the results:\n" +
                String.format("%s has %d points.\n",player1.getName(),player1.getPoint())
        + String.format("%s has  %d points.",player2.getName(),player2.getPoint()));

           if (player1.getPoint() > player2.getPoint())
               JOptionPane.showMessageDialog(null,player1.getName() + " is the grand winner!");
           else if (player2.getPoint() > player1.getPoint())
               JOptionPane.showMessageDialog(null,player2.getName() + " is the grand winner!");
           else
               JOptionPane.showMessageDialog(null,"Both players are tied!");
       }
    }
