package projectOne;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rounds;
        String name1;
        String name2;
        int hitPoints1;
        int hitPoints2;
        String moveName1;
        String moveName2;
        int movePower1;
        int movePower2;
        int attackSpeed1;
        int attackSpeed2;
        int total1 = 0;
        int total2 = 0;


        System.out.println("Enter an odd number of rounds");
        rounds = Integer.parseInt(console.nextLine());
        for (int r = 1; r <= rounds; r++) {
            System.out.println("Round: " + r);
            System.out.println("------------------");

            //Player 1
            System.out.println("Player 1: Select a Character and enter its stats");
            System.out.println("Enter player name: ");
            name1 = console.nextLine();
            System.out.println("Enter hit points: ");
            hitPoints1 = Integer.parseInt(console.nextLine());
            System.out.println("Enter move name: ");
            moveName1 = console.nextLine();
            System.out.println("Enter move power: ");
            movePower1 = Integer.parseInt(console.nextLine());
            System.out.println("Enter attack speed: ");
            attackSpeed1 = Integer.parseInt(console.nextLine());

            //Player2
            System.out.println("Player 2: Select a Character and enter its stats");
            System.out.println("Enter player name: ");
            name2 = console.nextLine();
            System.out.println("Enter hit points: ");
            hitPoints2 = Integer.parseInt(console.nextLine());
            System.out.println("Enter move name: ");
            moveName2 = console.nextLine();
            System.out.println("Enter move power: ");
            movePower2 = Integer.parseInt(console.nextLine());
            System.out.println("Enter attack speed: ");
            attackSpeed2 = Integer.parseInt(console.nextLine());

            while (hitPoints1 > 0 && hitPoints2 > 0) {

                if (attackSpeed1 > attackSpeed2) {
                    hitPoints2 -= movePower1;
                    if (hitPoints2 < 0) {
                        System.out.println("player 1:" + name1 + " wins round " + rounds);
                        total1++;
                    }
                    hitPoints1 -= movePower2;
                    if (hitPoints1 < 0) {
                        System.out.println("player 2:" + name2 + " wins round " + rounds);
                        total2++;
                    }
                } else if (attackSpeed2 > attackSpeed1) {
                    hitPoints1 -= movePower2;

                    if (hitPoints1 < 0) {
                        System.out.println("player 2:" + name2 + " wins round " + rounds);
                        total2++;
                    }
                    hitPoints2 -= movePower1;
                    if (hitPoints2 < 0) {
                        System.out.println("player 1:" + name1 + " wins round " + rounds);
                        total1++;
                    }
                } else {
                    Random rand = new Random();
                    int num = rand.nextInt(0, 1);
                    if (num == 0) {
                        hitPoints2 -= movePower1;
                        if (hitPoints2 < 0) {
                            System.out.println("player 1:" + name1 + " wins round " + rounds);
                            total1++;
                        }
                        hitPoints1 -= movePower2;
                        if (hitPoints1 < 0) {
                            System.out.println("player 2:" + name2 + " wins round " + rounds);
                            total2++;
                        }
                    }else{
                        hitPoints1 -= movePower2;

                        if (hitPoints1 < 0) {
                            System.out.println("player 2:" + name2 + " wins round " + rounds);
                            total2++;
                        }
                        hitPoints2 -= movePower1;
                        if (hitPoints2 < 0) {
                            System.out.println("player 1:" + name1 + " wins round " + rounds);
                            total1++;
                        }
                    }
                    }
                }
            System.out.println("WINS:\nPlayer 1 Wins: "+total1+"\nPlayer 2 Wins: "+total2);
            }
        System.out.println("Final Scores:");
        System.out.println("WINS:\nPlayer 1 Wins: "+total1+"\nPlayer 2 Wins: "+total2);
        if(total1>total2){
            System.out.println("player 1 has won the game");
        }else if(total2>total1){
            System.out.println("player 2 has won the game");
        }
        }
    }