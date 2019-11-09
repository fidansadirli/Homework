package hw2;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    static void print(char set[][]) {
        for (int i = 0; i <= 5; i++)
            System.out.print(i + " | ");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 5; j++) {
                System.out.print(set[i][j] + " | ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int x, y;
        char set[][] = new char[6][6];

        int a = rand.nextInt(5) + 1;
        int b = rand.nextInt(5) + 1;

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                set[i][j] = '-';
            }
        }

        System.out.println("All set. Get ready to rumble1");
        x = scan.nextInt();
        y = scan.nextInt();

        while (true) {
            if (x != a && y != b) {
                set[x][y] = '*';
                print(set);
                x = scan.nextInt();
                y = scan.nextInt();

            } else {
                set[x][y] = 'x';
                print(set);
                System.out.println("You Won!");
                break;
            }
        }
    }
}