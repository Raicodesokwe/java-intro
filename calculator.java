package introduction;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1,num2;

        Scanner pickvalues=new Scanner(System.in);

        System.out.println("Enter your first number");
        num1=pickvalues.nextDouble();

        System.out.println("Enter your second number");
        num2=pickvalues.nextDouble();

        System.out.println("Enter your operation");
        char operator=pickvalues.next().charAt(0);

        double result=0;
        pickvalues.close();

        switch (operator){

            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            case '%':
                result=num1%num2;
                break;
                default:
                    System.out.println("You have entered the wrong operator");
        }
        System.out.println("The result is"+result);
    }
}
