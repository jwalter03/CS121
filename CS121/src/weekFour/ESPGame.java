package weekFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String answer = "";
        int correct = 0;


        for (int n = 1; n <= 10; n++) {
            Random rand = new Random();
            int num = rand.nextInt(0, 5);

            System.out.println(n+". What color has the computer chosen?");
            answer = console.nextLine();

            String color = "";
            for (int c = 1; c <= 10; c++) {
                if (num == 0) {
                    color = "red";}
                if (num == 1) {
                    color = "green";}
                if (num == 2) {
                    color = "blue";}
                if (num == 3) {
                    color = "orange";}
                if (num == 4) {
                    color = "yellow";}
            }

        System.out.println(">The computer chose " +color);
            if(answer.equals(color)){
                correct++;
    }}
        System.out.println("You got " +correct+" out of 10");
}}