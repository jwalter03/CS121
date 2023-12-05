package weekFifteen;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SimpleNote {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        String DOB = JOptionPane.showInputDialog("Enter in your birthday in the format of MM/dd/yyyy");
        String CurrentDate = JOptionPane.showInputDialog("Enter in the current date in the format of MM/dd/yyyy");
        //parsing
        //try{}catch{}
        int day = 0;
        try{
            Date date1 = dateFormat.parse(DOB);
            Date date2 = dateFormat.parse(CurrentDate);
            //unix Epoch ---> January 1, 1970
            //millisecond, days, years
            long difference = date2.getTime() - date1.getTime();
            day = (int)TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
            double years = day/365.25;

            JOptionPane.showMessageDialog(null,String.format("Your Birthday is: %s%n\nThe current date is: %s%n\nYour age is %d in milliseconds %n\nYour age is %d days\n" +
                    "Your age is %.3f years",date1,date2,difference,day,years));

        }catch(ParseException e){
            e.printStackTrace();
        }

    }
}
