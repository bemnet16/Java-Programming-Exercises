import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex {

    public static void main(String[] args) throws Exception{


        String s = "This is the first encryption code for me.";
        enc(s);
        dec("pr.txt");
    }

    public static void enc(String str) throws IOException{

        PrintWriter pr = new PrintWriter("pr.txt");
        String st = "";

        char[] cha = str.toCharArray();
        for(char c:cha){

            int i = c + 10;
            st += ((char)i);

        }
        System.out.println(st);
        pr.print(st);
        pr.close();

    }
    public static void dec(String name) throws IOException{

        File f = new File(name);
        Scanner s = new Scanner(f);
        String re = "";

        while (s.hasNext()){
            String st = s.nextLine();
            char[] ch = st.toCharArray();

            for(char c:ch){
                int i = c - 10;
                re += (char)i;
            }
        }
        System.out.println(re);
    }
}
