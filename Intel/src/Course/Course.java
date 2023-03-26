package Course;

public class Course{
    private String courseName;
    private
    Instructor instructor;
    private Text text;

    public Course(String cn, Instructor in, Text te){
        courseName = cn;
        instructor = new Instructor(in);
        text = new Text(te);
    }
    public String toString() {
        String str = "Course.Course name: " + courseName +
                "\nCourse.Course.Instructor Information:\n" +
                instructor +
                "\nTextbook Information:\n" +
                text;
        return str;
    }
}