import java.io.*;
import java.util.*;

public class prat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();

        int count=0;
        if(S.length()>3){
            char c=sc.next().charAt(0);
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)==c){
                    count++;
                }

            }System.out.println(count);
        }
        else{
            System.out.println("Invalid");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}