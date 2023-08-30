import java.lang.reflect.Array;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Random;


public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
        Random randNumber = new Random();
        int Num = randNumber.nextInt(20);
            arrList.add(Num);
        }
        return arrList;
    }

    public char getRandomLetter(){
        char[] charArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random randLetter = new Random();
        int Str = randLetter.nextInt(26);
        return charArray[Str];
    }

    public String generatePassword(){
        String strPassword = "";
        for (int i = 0 ; i<9;i++){
            strPassword += getRandomLetter();
        }
        return strPassword;
    }
    public  ArrayList<String> getNewPasswordSet(int n){
        ArrayList<String> multiPasswords = new ArrayList<String>();
        for (int i =0; i<n; i++){
            multiPasswords.add(generatePassword());
        }
        return multiPasswords;
    }
}