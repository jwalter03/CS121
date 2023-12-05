package weekTwo;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "You entered:" +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You entered: "+age);
        String city = JOptionPane.showInputDialog("Enter the city you live in:");
        JOptionPane.showMessageDialog(null, "You entered:" +city);
        String college = JOptionPane.showInputDialog("Enter your college name:");
        JOptionPane.showMessageDialog(null, "You entered:" +college);
        String major = JOptionPane.showInputDialog("Enter your major:");
        JOptionPane.showMessageDialog(null, "You entered:" +major);
        String petType = JOptionPane.showInputDialog("Enter your favorite type of pet:");
        JOptionPane.showMessageDialog(null, "You entered:"+petType);
        String petName = JOptionPane.showInputDialog("Enter a pet name:");
        JOptionPane.showMessageDialog(null, "You entered:"+petName);

       // String story = String.format("");
        JOptionPane.showMessageDialog(null, String.format("There once was a person named: %s who lived in %s. At the age of: %d ,: %s " +
                "went to college at: %s and graduated with a: %s major. " +
                "Then,: %s adopted a(n): %s named:%s. They both lived happily ever after!",name,city,age,name,college,major,name,petType,petName));
    }
}
