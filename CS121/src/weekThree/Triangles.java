package weekThree;

import javax.swing.*;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int a = Integer.parseInt(console.nextLine());

        System.out.println("Enter a number 2");
        int b = Integer.parseInt(console.nextLine());

        System.out.println("Enter a number 3");
        int c = Integer.parseInt(console.nextLine());

        String triangle;
        triangle ="";
        if (a != b && a != c && b !=c) {
            triangle = "scalene";
        }else if(a == b || a == c || b == c) {
            triangle = "Isosceles";
        }if(a == b && a == c && b == c){
                triangle = "Equilateral";
        }

        System.out.println("The triangle you entered is: " +triangle);


    }
}
