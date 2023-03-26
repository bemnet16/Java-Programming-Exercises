package DriverLicences;

import java.util.ArrayList;

public class DriverLicence {

    private String[] answer = {"B","D","A","A","C","A","B","A","C","D","B","C","D","A","D","C","C","B","D","A"};

    private String[] studentAnswer = new String[20];

    public DriverLicence(String[] studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public boolean passed(){
        int count = 0;

        for(int i = 0;i < answer.length;i++){
            if(answer[i].equalsIgnoreCase(studentAnswer[i]))
                count++;
        }
        return count >= 15;
    }

    public int correctAnswers(){
        int count = 0;

        for(int i = 0;i < answer.length;i++){
            if(answer[i].equalsIgnoreCase(studentAnswer[i]))
                count++;
        }
        return count;
    }

    public int incorrectAnswers(){
        return 20 - correctAnswers();
    }

    public ArrayList<Integer> missed(){
        ArrayList<Integer> missed = new ArrayList<>();

        for(int i = 0;i < answer.length;i++){
            if(studentAnswer[i].isEmpty())
                missed.add(i + 1);
        }
        return missed;
    }
}

