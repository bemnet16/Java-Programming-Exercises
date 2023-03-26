package Park;

public class ParkMain {
    public static void main(String[] args) {
       /* String str = "how are you bemnet adugnaw";
        System.out.println(str.endsWith(" adugnaw"));
        char[] ne = {'a','d','f','g','q'};
        System.out.println(ne.length);
        System.out.println(String.valueOf(ne).length());
        double d = 34.4554;
        String s = String.valueOf(d);
        System.out.println(s + d);
        StringBuilder b = new StringBuilder(s);
        b.deleteCharAt(2);
        b.insert(2,'R');
        b.append('B');
        System.out.println(b);
        String t = new String("bemnweqt");
        String [] w = t.split("[e,n]");
        for(String q:w)
            System.out.println(q);
        for(int i = t.length() - 1;i >= 0;i--){
            System.out.print(t.charAt(i));
        }*/
        Subb s = new Subb();

    }
}
class Super{
    public Super(){
        System.out.println("This is the super class constractor ");
    }
    public Super(int ard){
        System.out.println("the value of the argument is this " + ard);
    }
}

class Sub extends Super{
    public Sub(){
        super(12);
        System.out.println("This is the sub class constractor ");
    }
}

class Subb extends Sub{
    public Subb(){
        super();
        System.out.println("and This is The Park.Subb class constructor ");
    }
}