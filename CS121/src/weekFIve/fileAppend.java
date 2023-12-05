package weekFIve;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileAppend {
    public static void main(String[] args) throws IOException {
        try{
            //instance of our file writer class and print writer class
            FileWriter filewriter = new FileWriter("courses.txt",true);
            PrintWriter output = new PrintWriter(filewriter);
            String course = JOptionPane.showInputDialog("Enter Course Name");
            String credits = JOptionPane.showInputDialog("Enter Course Credits");
            String score = JOptionPane.showInputDialog("Enter Course Score");

            output.printf("%n%s %s %s",course, credits,score);

            //close out of printwriter and file writer class
            filewriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("File Issue");
        }
    }
}
