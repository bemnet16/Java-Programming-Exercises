import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainPra {
    /*This class contains
    - word counter method
    - password verifier method
    - mostFrequent method
    - replaceSubString method
    - wordCount method
     */

    public static void main(String[] args) {


        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(12,"tewelve");
        map.put(13,"foretewelve");
        map.put(14,"theerewelve");
        System.out.println(map.values() + " " + map.get(12));

        String str1 = "thheeeeaaaaaaaaaaahhee";
        String str2 = "the";
        String str3 = "thaaaat";
        System.out.println(mostFrequent(str1));
        System.out.println(replaceSubString(str1,str2,str3));
        String str = "12345";
        String[] a = str.split("");
        int i = 0;
        char[] ch = str.toCharArray();
        for(char c:ch){
            i += Integer.parseInt(String.valueOf(c));
        }
        System.out.println("result : " + i);


       // System.out.print("Enter your sentence : ");
       // String str = new Scanner(System.in).nextLine();
       // System.out.println(wordCounter(str));

       // System.out.print("Enter your password : ");
       // str = new Scanner(System.in).nextLine();
       // System.out.println(passwordVerify(str)?"acceptable password":"wrong password");

    }

    public static String wordCounter(String str){

        String[] s = str.split("[ ]");
        return "NO of words : " + s.length;

    }

    public static boolean passwordVerify(String password){
        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;

        if(password.length() < 6){
            System.out.println("password must have 6 or greater length");
            System.exit(0);
        }
        for(int i =0;i < password.length();i++){
            if(Character.isDigit(password.charAt(i)))
                digit++;

            else if(Character.isUpperCase(password.charAt(i)))
                upperCase++;

            else if(Character.isLowerCase(password.charAt(i)))
                lowerCase++;
        }
        return digit > 0 && upperCase > 0 && lowerCase > 0;
    }

    public static long wordCount(String str){

        String[] words = str.split(" ");

        return Arrays.stream(str.split(" ")).count();
    }

    public static String arrayToString(char[] ch){

        String str = String.valueOf(ch);
        return str;
    }

    public static char mostFrequent(String str){

        char mostFre = ' ';
        int count = 0;
        String[] arr = str.split("");

        for(int i =0;i<str.length();i++){

            int temp = 0;
            for(int j =0;j<str.length();j++){
                if (arr[i].equalsIgnoreCase(arr[j])){
                    temp += 1;
                }
        }
           if(temp > count){
               count = temp;
               mostFre = arr[i].charAt(0);
           }
        }
        return mostFre;
    }

    public static String replaceSubString(String str1, String str2, String str3){

        return str1.replace(str2,str3);
    }
}