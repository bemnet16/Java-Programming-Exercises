import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class Printwritter {
    public static void main(String[] args) throws IOException {
        int to = 0;
        PrintWriter w = new PrintWriter("NumberList.txt");
        for(int i = 1;i < 101;i++){
            w.println(i);
        }
        w.close();

        FileWriter l = new FileWriter("NumberList.txt",true);
        PrintWriter p = new PrintWriter(l);
        for(int i = 101;i < 201;i++){
            p.println(i);
        }
        l.close();

        File f = new File("NumberList.txt");
        if(!f.exists()){
            System.out.println("this file is not exist yet!");
            System.exit(0);
        }
        Scanner s = new Scanner(f);
        while(s.hasNext()){
            int i = s.nextInt();
            to += i;
            System.out.println(i);
        }
        System.out.println(to);
        s.close();
    }
}
