package weekFour.loopsActivities;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of floors");
        int floors = Integer.parseInt(console.nextLine());

        int occ= 0;
        int rooms=0;
        int totalRooms = 0;
        int totalOcc =0;

        for(int n = 1; n <= floors; n++){
            System.out.println("Enter number of rooms on each floor"+n);
            rooms = Integer.parseInt(console.nextLine());
            totalRooms = rooms +totalRooms;

            System.out.println("How many rooms are occupied on this floor?");
            occ = Integer.parseInt(console.nextLine());

            totalOcc = occ+totalOcc;

        }

        int totalVacant = (totalRooms - totalOcc);
        double occRate = (double)totalOcc / totalRooms;
        System.out.printf("Total number of floors: %d\nTotal number of rooms: %d\n" +
                "Total number of occupied rooms: %d\n" +
                "Total vacant rooms: %d\nTotal occupancy rate: %.2f" ,floors, totalRooms, totalOcc, totalVacant, occRate);

    }
}
