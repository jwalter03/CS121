package weekThree;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Is anyone in your party vegetarian?");
        String veg = console.nextLine();

        System.out.println("Is anyone in your party vegan?");
        String vegan = console.nextLine();

        System.out.println("Is anyone in your party gluten free?");
        String glutenFree = console.nextLine();

        System.out.println("Your restaurant choices are: ");


        if(veg.equals("No") && vegan.equals("No") && glutenFree.equals("No") ){
            System.out.println("Joe's Gourmet Burgers");
        }
        else if(veg.equals("Yes") && vegan.equals("No") && glutenFree.equals("No") ){
            System.out.println("Mama's Fine Italian");
        }
        else if(veg.equals("Yes") && vegan.equals("No") && glutenFree.equals("Yes") ){
            System.out.println("Main Street Pizza Company");
        }
        System.out.println("Corner Café, \nThe Chef's Kitchen");
    }
}
