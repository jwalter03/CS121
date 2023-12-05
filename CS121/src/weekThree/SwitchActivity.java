package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String planet = JOptionPane.showInputDialog(null, "Enter a planet");
        String planetInfo = "";
        switch(planet){
            case"Earth":
                planetInfo = "This here we live now. Earth is the 3rd planet from the sun.";
                break;
            case"mars":
                planetInfo = "This is know as the red planet and is the 4th planet from the sun";
                break;
            case"Venus":
                planetInfo = "You entered in Venus. Venus is the 2nd planet from the sun. ";
                break;
            case"Mercury":
                planetInfo = "You entered in Mercury. Mercury is the 1st planet from the sun.";
                break;
            case"Saturn":
                planetInfo = "You entered in Saturn. Saturn is the 6th planet from the sun. ";
                break;
            case"Jupiter":
                planetInfo = "You entered in Jupiter. Jupiter is the 5th planet from the sun. ";
                break;
            case"Neptune":
                planetInfo = "You entered in Neptune. Neptune is the 8th planet from the sun. ";
                break;
            case"Uranus":
                planetInfo = "You entered in Uranus. Uranus is the 7th planet from the sun. ";
                break;

            default:
                planetInfo = "The planet you entered there is no info";
                break;
        }
        JOptionPane.showMessageDialog(null,planetInfo);

    }
}
