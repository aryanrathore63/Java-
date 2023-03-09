import java.io.*;
import java.util.*;
public class hackerrank{
    static void findPrime(int n){
        for(int i = 2 ; i <= n ; i++){
            boolean flag = true;
            if(n%i == 0){

                for( int j =2 ; j < i; j++){
                    if(i%j == 0){
                        flag =false;
                        break;
                    }
                }
                if(flag)System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(  val > 10  &&  val < 50){
            findPrime(val);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}