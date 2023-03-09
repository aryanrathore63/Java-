interface Test{
    boolean check(int x);
}
class Demo{
    void filter(Test ob){
        System.out.println("very important");
    }
}

public class anonymous_class {
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.filter(
                new Test(){
                    public boolean check(int x){
                        return x%2==1;
                    }
                }
        );

    }
}
