package weekThree;

import javax.swing.*;

public class switchLogic   {
    public static void main(String[] args) {
        String planet = JOptionPane.showInputDialog(null, "Enter a planet");
        String planetInfo = "";
        switch(planet){
            case"earth":
                planetInfo = "Where we live now";
                break;
            case"mars":
                planetInfo = "this is know as the red planet";
                break;
            case"venus":
                planetInfo = "you entered in venus";
                break;
            default:
                planetInfo = "the planet you entered there is no info";
                break;
        }
        JOptionPane.showMessageDialog(null,planetInfo);

        //switch expression
        String planetExpress = JOptionPane.showInputDialog("enter a planet");
        String planetInfoExpress = switch (planetExpress){
            case "earth" -> "this is where you live";
            case"mars" -> "this is know as the red planet";
            case"venus" -> "you entered venus";
            default -> "the planet you entered there is no info";
        };



    }
}
