abstract  class Restrurant{
    void oderfood(){

    }
    abstract void getBill();
}
class food extends Restrurant{
    void food_item(){
        String s="momos";
        String s2="pizza";
        System.out.println(s);
        System.out.println(s2);
    }

    @Override
    void getBill() {

    }
}
class Main{
    public static void main(String[] args) {
        food item=new food();
        item.oderfood();
        item.food_item();

    }
}
//interface  pub{
//    void getDrink();
//    default void getBill(){
//
//    }
//}