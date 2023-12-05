package weekTwo;

import javax.swing.*;

public class StringsDialog {
    public static void main(String[] args) {
        //JOptionPane
        String Fname = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "You entered : "+ Fname);

        //integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You entered : " +age);

        //double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa: "));
        JOptionPane.showMessageDialog(null, "You entered: " +gpa);

        //System.out.printf("%d %n %s");
        //JOptionPane.showMessageDialog(null, String.format("The story of the person bla bla %n%s age:  "));
        //JOptionPane.showMessageDialog(null, story);



        //Strings
        String name ="Robin";
        //.concat()
        name.concat("Tilfod");
        System.out.println(name);
        name = name.concat("Tilfod");
        System.out.println(name);

        //.length() ---> method in string class
        System.out.println(name.length());
        //.charAt() ---> method in string class
        System.out.println(name.charAt(4));
        //.replace()---> method in string class
        System.out.println(name.replace("RobinTilford" ,"Jacob"));
        //.substring()
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,4));



    }
}
