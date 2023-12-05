package weekTwo;

import java.util.Scanner;

public class IntegerDiv {
    public static void main(String[] args) {
        //console input
        //scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");

        String firstName = keyboard.nextLine();
        System.out.println("What is your age?");
        //int age = keyboard.nextInt();
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println(age);
        System.out.println("What is your GPA");
        double gpa = Double.parseDouble(keyboard.nextLine());
        System.out.println(gpa);
        System.out.println(firstName);






        int numOne = 1;
        int numTwo = 4;
        double results = (double)numOne/numTwo;
        System.out.println(results);
        double result = (double)(numOne/numTwo);
        System.out.println(result);
        double result2 = (double)numTwo/numOne;
        System.out.println(result2);
        double result3 = (double)(numTwo/numOne);
        System.out.println(result3);

    }
}
