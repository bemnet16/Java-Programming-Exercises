package VowelConsonant;

import java.util.Scanner;

public class VowelMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;

        System.out.print("Enter your strings : ");
        str = in.nextLine();
        VowlCons vc = new VowlCons(str);
        menu(vc);




    }
    public static void menu(VowlCons vc){

        Scanner in = new Scanner(System.in);
        String str;
        String choice;



        System.out.println();
        System.out.println("\"_______________MENU_________________\"\n" +
                "a. Count the number of vowels in the string\n" +
                "b. Count the number of consonants in the string\n" +
                "c. Count both the vowels and consonants in the string\n" +
                "d. Enter another string\n" +
                "e. Exit the program");

        System.out.print("\nEnter your choice from menu : ");
        choice = in.nextLine();

        switch (choice.toLowerCase()){
            case "a": {
                System.out.println("The NO of vowels is : " + vc.getNumVowel());
                menu(vc);
            } case "b": {
                System.out.println("The NO of consonants is : " + vc.getNumConsonant());
                menu(vc);
            }case "c": {
                System.out.println("The NO of letters is : " + (vc.getNumVowel() + vc.getNumConsonant()));
                menu(vc);
            }case "d": {
                System.out.print("Enter your strings : ");
                str = in.nextLine();
                VowlCons v = new VowlCons(str);
                menu(v);
                break;
            }case "e": {
                System.out.println("Thanks for using this app!");
                System.exit(0);
            } default:{
                System.out.println("incorrect input! try again");
                menu(vc);
            }
        }
    }
}
