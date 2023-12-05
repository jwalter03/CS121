package weekFIve.activity11;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("/Users/jessicawalter/OneDrive - Ball State University/Homework/CS121/CS121/grades.txt");
        PrintWriter output = new PrintWriter(outputFile);
        //variables
        String Assignment,Grade,Score;
        output.printf("%s %s %s\n","Assignments","Grade","Score");
        for(int i = 1; i <= 3; i++){
            Assignment = JOptionPane.showInputDialog(String.format("Enter name of the assignment %d",i));
            Grade = JOptionPane.showInputDialog(String.format("Enter the letter grade %d",i));
            Score = JOptionPane.showInputDialog("Enter the course score");
            output.printf("%s %s %s\n",Assignment,Grade,Score);

        }
        output.close();
    }
}


