package Course;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String ln, String fn, String on){
        lastName = ln;
        firstName = fn;
        officeNumber = on;
    }
    public Instructor(Instructor inst){
        lastName = inst.lastName;
        firstName = inst.firstName;
        officeNumber = inst.officeNumber;
    }
    public void set(String ln, String fn, String on){
        lastName = ln;
        firstName = fn;
        officeNumber = on;
    }
    public String toString(){
        String str;
        str = "Last name : " + lastName +
                "\nFirst name :"  + firstName +
                "\nOffice number : " + officeNumber;
        return str;
    }
}
