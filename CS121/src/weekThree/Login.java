package weekThree;

import javax.swing.*;
import java.sql.SQLOutput;

public class Login {
    public static void main(String[] args) {
        String userName = "user";
        String password = "password";

        String enterUser = JOptionPane.showInputDialog("Enter the Username");
        String enterPassword = JOptionPane.showInputDialog("Enter the Password");

        if(userName.equals(enterUser) && (password.equals(enterPassword))){
            JOptionPane.showMessageDialog(null,"Welcome to CS121");

        }


        if(userName.equals(enterUser) && (!password.equals(enterPassword))){
            JOptionPane.showMessageDialog(null, "Password is incorrect");

        }
        if(!userName.equals(enterUser) && (password.equals(enterPassword))) {
            JOptionPane.showMessageDialog(null, "Username is incorrect");
        }
        if(!userName.equals(enterUser) && (!password.equals(enterPassword))) {
            JOptionPane.showMessageDialog(null, "Password and Username is incorrect");
        }




        }
}
