package hw1;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");

        Scanner scan = new Scanner(System.in);
        System.out.print("name: ");
        String name = scan.nextLine();
        int num = 0;
        int ran;


        Random rand = new Random();
        ran = rand.nextInt(100);


        while (num != ran) {
            System.out.print("Please, enter your number: ");
            num = scan.nextInt();
            if (num < ran) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (num > ran) {
                System.out.println("Your number is too big. Please, try again.");
            }
            System.out.println();
        }
        System.out.println("Congratulations, " + name + "!");


    }
}







