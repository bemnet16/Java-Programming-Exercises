package KiloMeterConverter;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
//"C:\\Users\\Bem\\Desktop\\inte\\a.txt"
public class New {
    public static void main(String[] args) {
        menu();
        System.exit(0);
    }
    public static void showKilometer(double meters){
        double kilometer = meters * 0.001;
        JOptionPane.showMessageDialog(null,String.format("%,.2f meters is %,.2f kilometers",meters,kilometer));
    }
    public static void showInchs(double meters){
        double inchs = meters * 39.37;
        JOptionPane.showMessageDialog(null,String.format("%,.2f meters is %,.2f inchs",meters,inchs));
    }
    public static void showFeet(double meters){
        double feets = meters * 3.281;
        JOptionPane.showMessageDialog(null,String.format("%,.2f meters is %,.2f feets",meters,feets));
    }
    public static void menu() {
        String input;
        double d;
        char c;
        do {
            input = JOptionPane.showInputDialog("Enter a distance in meters :");
            d = Double.parseDouble(input);
            input =JOptionPane.showInputDialog("1. Conver to kilometer \n 2. Convert to Inch \n 3. Convert to Feet \n 4. quit\n\nEnter your choice :");
            c = input.charAt(0);
        } while (d < 0);
        while (c == '1' || c == '2' || c == '3' || c == '4'){
            if (c == '1'){
                showKilometer(d);
                input =JOptionPane.showInputDialog("1. Conver to kilometer \n 2. Convert to Inch \n 3. Convert to Feet \n 4. quit\n\nEnter your choice :");
                c = input.charAt(0);
            }else if(c == '2'){
                showInchs(d);
                input =JOptionPane.showInputDialog("1. Conver to kilometer \n 2. Convert to Inch \n 3. Convert to Feet \n 4. quit\n\nEnter your choice :");
                c = input.charAt(0);
            }else if(c == '3'){
                showFeet(d);
                input =JOptionPane.showInputDialog("1. Conver to kilometer \n 2. Convert to Inch \n 3. Convert to Feet \n 4. quit\n\nEnter your choice :");
                c = input.charAt(0);
            }else{
                JOptionPane.showMessageDialog(null,"BYE");
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null,"please try again and enter the correct input");
    }
}
