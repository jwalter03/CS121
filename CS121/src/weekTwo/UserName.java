package weekTwo;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.nextLine();

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        StringBuilder reverseName = new StringBuilder(name);
        System.out.println(reverseName.reverse());
        reverseName.reverse();


    }
}
