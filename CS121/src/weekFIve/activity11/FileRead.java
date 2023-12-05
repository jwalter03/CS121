package weekFIve.activity11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        File file = new File("/Users/jessicawalter/OneDrive - Ball State University/Homework/CS121/CS121/grades.txt");
        try {
            Scanner scanner = new Scanner(file);
            String header = scanner.nextLine();
            while (scanner.hasNextLine()) {
                String Assignment = scanner.next();
                String Grade = scanner.next();
                int Score = Integer.parseInt(scanner.next());
                System.out.printf("%7s %3d %7s\n", Assignment, Score, Grade);

            }
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.err.println("FILE NOT FOUND YOUR PATH HAS ISSUES*****");
        }
    }
}