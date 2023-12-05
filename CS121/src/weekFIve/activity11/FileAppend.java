package weekFIve.activity11;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
            try {

                FileWriter filewriter = new FileWriter("grades.txt", true);
                PrintWriter output = new PrintWriter(filewriter);
                String Assignment = JOptionPane.showInputDialog("Enter Assignment Name");
                String Score = JOptionPane.showInputDialog("Enter the assignment score");
                String Grade = JOptionPane.showInputDialog("Enter the assignment grade");

                output.printf("%n%s %s %s", Assignment, Score, Grade);

                //close out of printwriter and file writer class
                filewriter.close();
                output.close();

            } catch (FileNotFoundException e) {
                System.err.println("File Issue");
            }
        }
    }

