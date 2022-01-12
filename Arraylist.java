package introduction;

import java.util.ArrayList;
import java.util.List;
public class Arraylist {
    public static void main(String[] args) {
       List<String>food=new ArrayList<>();

       food.add("Rice");
       food.add("Ugali");
       food.add("beans");
       food.add("tea");
       food.add("chips");

        System.out.println(food);

        food.add(1,"beef");

        System.out.println(food);

        String favorite=food.get(4) ;

        System.out.println("My favorite is"+favorite);

        String lfavorite=food.get(food.size()-1);

        System.out.println("My least favorite is "+lfavorite);
    }
}
