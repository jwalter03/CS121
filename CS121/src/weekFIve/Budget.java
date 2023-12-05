package weekFIve;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int budget;
        int expenses;
        int totalExp = 0;
        int over = 0;
        int under =0;
        System.out.println("Enter a monthly budget");
        budget = Integer.parseInt(console.nextLine());
        for (int e = 1; e <= 10; e++) {
            System.out.println("Enter expense:"+e);
            expenses = Integer.parseInt(console.nextLine());
            totalExp = expenses+totalExp;
        }
        if(budget<totalExp){

            over = totalExp - budget;
            System.out.println("You are over budget by:" +over);
        }
        if(budget>totalExp){

            under = budget-totalExp;
            System.out.println("You are under budget by:" +under);
        }
        System.out.println("Budget: "+budget);
        System.out.println("Total Expenses: "+totalExp);

    }
}
