package DriverLicences;

import java.util.Scanner;

public class DriverMain {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] studentAnswer = new String[20];

        for(int i = 0;i < studentAnswer.length;i++){
            System.out.print("Enter answer " + (i + 1) + " : ");
            String answer = input.nextLine();

            while(!isValid(answer)){
                System.out.print("invalid answer!!!" +
                        "\nplease enter your valid answer : ");
                answer = input.nextLine();
            }
            studentAnswer[i] = answer;
        }

        System.out.println();

        DriverLicence driver1 = new DriverLicence(studentAnswer);

        System.out.println();

        if(driver1.passed()){
            System.out.println("CONGRATULATION YOU PASSED");
        }else
            System.out.println("sorry you failed");

        System.out.println("you answered " + driver1.correctAnswers() + " questions correctly" +
                "\nyou missed " + driver1.incorrectAnswers() + " questions" +
                "\nyou left " + driver1.missed() + " question numbers empty");


    }

    public static boolean isValid(String answer){

        return answer.equalsIgnoreCase("A") ||
                answer.equalsIgnoreCase("B") ||
                answer.equalsIgnoreCase("C") ||
                answer.equalsIgnoreCase("D") ||
                answer.isEmpty();
    }
}