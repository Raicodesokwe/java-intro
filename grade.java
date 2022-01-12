package introduction;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        Scanner pickgrades;


        pickgrades = new Scanner(System.in);
        System.out.println("Please enter your marks");

        int marks=pickgrades.nextInt();
        if (marks > 90 && marks <= 100) {
            System.out.println("You have an A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("You have a B");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("You have a C");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("You have a D");
        } else if (marks > 0 && marks <= 50) {
            System.out.println("You have an E");
        }


    }
}