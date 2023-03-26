package Course;

public class Text {
    private String title;
    private String author;
    private String publisher;

    public Text(String ti, String au, String pu){
        title = ti;
        author = au;
        publisher = pu;
    }
    public Text(Text te){
        this(te.title,te.author,te.publisher);
    }
    public void set(String ti, String au, String pu){
        title = ti;
        author = au;
        publisher = pu;
    }
    public String toString(){
        String str;
        str =  "Title : " + title +
                "\nAuthor :"  + author +
                "\nPublisher : " + publisher;
        return str;
    }
}
