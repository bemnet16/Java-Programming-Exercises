package Course;

public class N{
    enum Day {MONDAY,TUSDAY,WEDNSDAY,THURSDAY}
    public static void main(String[] args) {
        Instructor i = new Instructor("adugnaw","bemnet","123");
        //System.out.println(i.toString());
        Text t = new Text("emegua","Dr alemayehu","birhanina selam");
        //System.out.println(t.toString());
        Course c = new Course("java",i,t);
        System.out.println(c);
        Day d = Day.MONDAY;
        System.out.println(d.toString().toLowerCase());
    }
}