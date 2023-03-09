import java.io.*;
import java.util.*;

public class Mark_check {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String key=sc.nextLine().toUpperCase();
        int n=sc.nextInt();
        sc.nextLine();
        if(n>0){
            for(int i=0;i<n;i++) {
                String answer = sc.nextLine().toUpperCase();
                double marks = 0;
                for (int j = 0; j < 5; j++) {
                    switch (answer.charAt(j)) {
                        case 'X':
                            break;
                        case 'x':
                            break;
                        default:

                            if (answer.charAt(j) == key.charAt(j)) {
                                marks++;

                            } else {
                                marks -= 0.25;
                            }
                    }
                }
                System.out.print(marks + " ");
            }
        }
    }
}