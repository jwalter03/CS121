package weekNine;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        int [] tableNum = new int[3];
        boolean [] tablesAvailable = new boolean[3];
        int [] tableSize = new int[3];
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Enter your table number "+(i+1)+":" );
            tableNum[i] = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter your table size "+(i+1)+":" );
            tableSize[i] = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter table availability "+(i+1)+":" );
            tablesAvailable[i] = Boolean.parseBoolean(keyboard.nextLine());
        }
        System.out.println("The tables");
        System.out.println("--------------------");
        //Header
        System.out.println("Table Number\tTable Size\tTables Available");
        for(int i= 0; i < tableNum.length; i++){
            System.out.println("Table"+(i+1)+": "+tableNum[i]+"\t       " +tableSize[i]+"\t         " +tablesAvailable[i]);
        }
    }
}
