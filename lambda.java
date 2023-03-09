//interface A
//{
//    void prime(int x);
//}
//
//public class lambda
//{
//    public static void main(String[] args)
//    {
//        A ob = (x) -> System.out.println(x%2!=0);
//        ob.prime(5);
//    }
//}

interface X{boolean   isPrime(int a);}
interface Y{int largest(int a,double d);}
interface Z{void printLargest(int x,int y,int z);}
public class lambda {
    public static void main(String[] args) {
        X ob1=a -> {
            boolean flag =true;
            for (int i=2;i<a;i++){
                if(a%2==0){
                    flag=false;
                    break;
                }
            }
            return flag;
        };
        ob1.isPrime(5);
//        Y ob2=(int a, double d) -> System.out.print(a>d?a:(int)d);
//        ob2.largest(2,3);
        Z ob3=(x, y, z) -> System.out.println(x>y?x>z?x:z:y>z?y:z);
        ob3.printLargest(4,5,8);
    }
}

