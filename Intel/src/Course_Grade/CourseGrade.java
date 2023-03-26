package Course_Grade;

import java.util.Scanner;

public class CourseGrade implements Analayzable{

    GradeActivity lab;
    PassFail passFail;
    GradeActivity essay;
    FinalExam finalExam;
    private GradeActivity[] grade = new GradeActivity[4];

    public CourseGrade(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the score for lab : ");
        double result = in.nextDouble();
        while (result < 0){
            System.out.print("Enter the correct result");
            result = in.nextInt();}
        System.out.print("Enter the max possible score : ");
        int max = in.nextInt();
        lab = new GradeActivity(result,max);
        setLab(lab);

        System.out.print("Enter the pass fail result : ");
        result = in.nextDouble();
        passFail = new PassFail(result);
        setPassFail(passFail);

        System.out.print("Enter the score for essay : ");
        result = in.nextDouble();
        essay = new GradeActivity(result,30);
        setEssay(essay);

        System.out.print("Enter final exam result : ");
        result = in.nextInt();
        finalExam = new FinalExam((int)result);
        setFinalExam(finalExam);

        System.out.println();
        System.out.println();


    }

    public void setLab(GradeActivity ga){
        grade[0] = ga;
    }

    public void setPassFail(PassFail pf){
        grade[1] = pf;
    }

    public void setEssay(GradeActivity ga){
        grade[2] = ga;
    }

    public void setFinalExam(FinalExam fe){
        grade[3] = fe;
    }

    public String toString(){

        double percentage;
        int index = 0;

        String[] testName = {
                "(Lab test)", "(Pass/Fail test)" ,"(Essay test)" ,"(Final Exam)"
        };

        for(GradeActivity activity:grade){


            System.out.println("grade for : " + testName[index] +
                    "\nScore: " + (int)activity.getScore() + "/" + activity.getMAX() +
                    "\nPercentage: " + activity.getPercentage() + "%" +
                    "\nGrade: " + activity.getGrade(activity.getPercentage()));
            System.out.println();

            index++;

        }

        System.out.println("_________________________________");

        System.out.println("Avarage : " + getAvarage() +
        "\nHeighest score : " + getHeighest() +
                "\nLowest score : " + getLowest());

        return "";
    }

    public double getAvarage(){
        double ava;

        ava = grade[0].getScore() + grade[2].getScore();
        return ava / 2;

    }

    // It return GradeActivity object
    public GradeActivity getHeighest(){
        // if lab score greater than essay score return lab score object
        return (grade[0].getScore() > grade[2].getScore())?grade[0]:grade[2];

    }

    public GradeActivity getLowest(){

        return (grade[0].getScore() < grade[2].getScore())?grade[0]:grade[2];

    }

}
