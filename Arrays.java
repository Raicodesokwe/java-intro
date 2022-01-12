package introduction;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int number;
        String [] names;
        Scanner input=new Scanner(System.in);
        System.out.println("How many names do you have?");
        number=input.nextInt();
        names=new String[number];


        for (int i=0;i<number;i++){
            System.out.println("Enter your name");
            names[i]=input.next();
        }

        System.out.println("Your name is");
        for (int i=0;i<number;i++){
            System.out.println(names[i]);
        }
    }
}
