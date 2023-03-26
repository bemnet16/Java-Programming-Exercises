package Course_Grade;

public class PassFail extends GradeActivity{

    //private double score;
    private static int MAX_QUE = 10;

    public PassFail(double score){
        super(score,MAX_QUE);
    }

    public boolean isPassed(){
        double score = ((double) super.getScore() / super.getMAX());
        score *= 100;

        return score >= 70;
    }
}
