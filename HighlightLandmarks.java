import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        //Read input string
        String s = new String();
        s = sc.nextLine();
        //Split into array of strings
        String[] splitInput = s.split(" ");
        //Input number of words
        int number = sc.nextInt();
        String highlights[] = new String[number];
        for(int i = 0; i < number; i++){
            highlights[i] = sc.next();
        }
        //StringBuffer to append output
        StringBuffer concatNew = new StringBuffer();
        for(String x : splitInput){
            for(int i = 0; i < number; i++){
                if(x.compareTo(highlights[i]) == 0){
                    x = "<b>"+x+"</b>";
                }
            }
            //Append updated string
            concatNew.append(x+" ");

        }
        //Print output
        System.out.println(concatNew);
    }
}
