package VowelConsonant;

import java.util.Locale;

public class VowlCons {

    private int numVowel = 0;
    private int numConsonant = 0;
    private final String VOWELS = "aeiou";
    private String str;

    public VowlCons(String str){

        this.str = str;
        getVowel();
        getConsonant();

    }

    public int getNumVowel() {
        return numVowel;
    }

    public int getNumConsonant() {
        return numConsonant;
    }

    public void getVowel(){



        for(int i=0;i < str.length();i++){

            String st = String.valueOf(str.charAt(i));

            if(VOWELS.contains(st.toLowerCase(Locale.ROOT)))
                numVowel++;
        }
    }

    public void getConsonant(){


        for(int i=0;i < str.length();i++){

            String st = String.valueOf(str.charAt(i));

            if((!VOWELS.contains(st.toLowerCase(Locale.ROOT))) && Character.isLetter(str.charAt(i)))
                numConsonant++;
        }
    }
}
