package Course_Grade;

public class FinalExam extends GradeActivity{

    private static int MAX_QUES = 50;

    public FinalExam(int score){
        super(score,MAX_QUES);
    }

    public int getMaxQues(){
        return MAX_QUES;
    }
}
