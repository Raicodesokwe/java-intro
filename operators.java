package introduction;

public class operators {
    public static void main(String[] args) {
        //Unary Operators

        int x=10;

        int y=20;

        int z=8;

        int a=-10;

        int c=7;

        System.out.println(x++);

        System.out.println(++x);
        System.out.println(-x);
        System.out.println(x--);

        System.out.println(x++ + ++y);
        System.out.println(~z);
        System.out.println(~a);

        boolean b=true;
        System.out.println(b);
        System.out.println(!b);

        //Arithmetic operators

        int sum=x+y;

        System.out.println("The sum of x and y is "+sum);

        int diff=y-x;

        System.out.println("The difference of y and x is "+diff);

        int prod=x*y;

        System.out.println("The product of x and y is"+prod);

        double div=x/y;

        System.out.println("The divided value is "+div);

        double mod=z%c;
        System.out.println("The modulus is "+mod);

        // left shift operator

        System.out.println(x<<2); // 10*2^2

        System.out.println(15<<3); //15*2^3

        //Right shift operator

        System.out.println(10>>2);  //10/2^2

        System.out.println(20>>2);  //20/2^z

        //logical operators

        int num1=40; int num2=50; int num3=60;

        System.out.println(num1<num2 && num1<num3);
        System.out.println(num1>num2 && num2<num1);
        System.out.println("The logical not ~ "+!(num1>num2 && num2<num1));

        System.out.println(num1<num2 || num1<num3);
        System.out.println(num1>num2 || num2<num1);
        System.out.println(num1>num2 || num2>num1);
    }

}
