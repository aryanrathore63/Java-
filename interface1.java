//interface A{
//    int a=10;
//    void test();
//    default void myDefault(){
//        System.out.println("IN A");
//    }
//}
//interface B{
//    int a=20;
//    void test();
//    default void myDefault(){
//        System.out.println("IN B");
//    }
//}
//class Multiple implements A,B{
//    public static void main(String[] args) {
//        Multiple ob=new Multiple();
//        ob.test();
//    }
//    public void test(){
//        System.out.println("A");
//    }
//    public void myDefault(){
//        System.out.println("x");
//        A.super.myDefault();
//    }
//}
