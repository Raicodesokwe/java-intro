package introduction;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner menu;
        char order;

        menu=new Scanner(System.in);
        System.out.println("Please enter your order");
        order=menu.next().charAt(0);

        switch (order){
            case 'A':
                System.out.println("YOU HAVE ORDERED FOR UGALI AND WHISKEY");
                break;
            case 'B':
                System.out.println("YOU HAVE ORDERED FOR CHAPATI AND MADONDO");
                break;
            case 'C':
                System.out.println("YOU HAVE ORDERED FOR FISH AND CHIPS");
                break;
            case 'D':
                System.out.println("YOU HAVE ORDERED FOR ANJERA AND CAMEL MILK");
                break;
                default:
                    System.out.println("THAT'S NOT READY YET");
        }
    }
}
