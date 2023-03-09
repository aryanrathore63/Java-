import java.io.*;
import java.util.*;

public class test {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String text=sc.nextLine();
       String par=sc.next();
       int index=sc.nextInt();
       int start=0;
       for(int i=0;i<index;i++) {
           if (text.indexOf(par, start) == -1) break;
           start=text.indexOf(par,start)+1;
           switch (start){
               case 0:
                   System.out.println("not present");
               default:

           }
       }
        System.out.println(start-1);

    }
}