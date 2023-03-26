package Course_Grade;

public class GradeActivity {

    private double score;
    private int MAX;

    public GradeActivity(double score , int max){
        this.score = score;
        this.MAX = max;
    }

    public void setScore(double score){
        this.score = score;
    }

    public double getScore(){
        return this.score;
    }

    public int getMAX(){
        return this.MAX;
    }

    public double getPercentage(){
        double per;

        double sc = getScore() / getMAX();
        per = sc * 100;
        return per;
    }

    public char getGrade(double test){
        char grade;

        if(test >= 90){
            grade = 'A';
        }else if(test >= 80){
            grade = 'B';
        }else if(test >= 70){
            grade = 'C';
        }else if(test >= 60){
            grade = 'D';
        }else{
            grade ='F';
        }

        return grade;
    }
}
