package emailapp;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;

public class hola {
    static String[] myArray = {"a", "b", "c", "d", "d", "c", "b", "a"};
    static  int n=8;

    public static void main (String args[]) {
        // Your code here
        String[] MySecondArray = myArray;
        Arrays.sort(MySecondArray, Collections.reverseOrder());
        if(myArray == MySecondArray && myArray.length == n){
            System.out.println("Symmetric");
        }else {
            System.out.println("Asymmetric");
        }
    }
}
