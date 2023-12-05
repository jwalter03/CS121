package weekTwo;

import java.util.Scanner;

public class UserMath {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        System.out.println("Enter your first integer: ");
        int numOne = Integer.parseInt(console.nextLine());
        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());


        //Addition +
        int add = (numOne + numTwo);
        System.out.printf("%d + %d = %d%n",numOne, numTwo, add);

        //Subtraction -
        int sub = (numOne - numTwo);
        System.out.printf("%d - %d = %d%n", numOne, numTwo, sub);

        //Multiplication *
        int mult = (numOne * numTwo);
        System.out.printf("%d * %d = %d%n",numOne, numTwo, mult);

        //Division /
        int divide = (numOne / numTwo);
        System.out.printf("%d / %d = %d%n",numOne, numTwo, divide);

        //Square Roots
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f.",numOne, sqrt1);

        //Power
        double power = Math.pow(numOne,numTwo);
        System.out.printf(" The power of %d and %d is: %.2f.",numOne, numTwo, power);

        //Logarithm
        double logar = Math.log(numOne);
        System.out.printf(" The log of %d is : %.2f.",numOne, logar);
    }
}
