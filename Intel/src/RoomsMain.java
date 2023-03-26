
import java.util.Scanner;
import javax.swing.JOptionPane;
//
public class RoomsMain {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int room = 0;
        int occ = 0;
        int va;
        double rate;
        //int to = 0;
        String a = JOptionPane.showInputDialog("Enter the number of the floor that your building have :");
        int s = Integer.parseInt(a);
        for(int i =1;i <= s;i++){
            a = JOptionPane.showInputDialog("How many rooms are there in floor " + i + " :");
            int r = Integer.parseInt(a);
            a = JOptionPane.showInputDialog("How many of them are occupied : ");
            int o = Integer.parseInt(a);
            room += r;
            occ += o;
        }
        JOptionPane.showMessageDialog(null,"The number of total rooms are : " + room);
        JOptionPane.showMessageDialog(null,"The number of total occupied rooms are :" + occ);
        va = room - occ;
        JOptionPane.showMessageDialog(null,"the number of vacant rooms are :" + va);
        rate = room / occ;
        JOptionPane.showMessageDialog(null,"The occupancy rate is :" + rate);
        System.exit(0);
        }
}
