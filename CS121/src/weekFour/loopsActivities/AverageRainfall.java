package weekFour.loopsActivities;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of years");
        int years = Integer.parseInt(console.nextLine());
        int totalRain = 0;

        for(int y = 1; y <= years; y++){
            int months = 12;
            for(int m = 1; m <= months; m++){
                System.out.println("enter inches of rainfall for year "+y+ " month " +m);
                int rainfall = Integer.parseInt(console.nextLine());
                totalRain = totalRain + rainfall;
            }

        }


        int totalM = years *12;
        double average = (double)totalRain / totalM;
        System.out.println("Number of months: "+ totalM);
        System.out.println("Total inches of rainfall: "+totalRain);
        System.out.println("Average rainfall per month for " +years+ "years: "+average);

    }
}
