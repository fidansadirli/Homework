package hw3;


import java.util.Scanner;

public class WeekPlanner {

    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go to the university";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "go to the gym";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "go to the courses";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go to the club";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "sleep";


        for (int i = 0; i < 100; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please, input the day of the week: ");

            String day = scan.nextLine();


            switch (day) {
                case "Sunday":
                    System.out.println("Your tasks for " + scedule[0][0] + ": " + scedule[0][1]);
                    break;
                case "Monday":
                    System.out.println("Your tasks for " + scedule[1][0] + ": " + scedule[1][1]);
                    break;
                case "Tuesday":
                    System.out.println("Your tasks for " + scedule[2][0] + ": " + scedule[2][1]);
                    break;
                case "Wednesday":
                    System.out.println("Your tasks for " + scedule[3][0] + ": " + scedule[3][1]);
                    break;
                case "Thursday":
                    System.out.println("Your tasks for " + scedule[4][0] + ": " + scedule[4][1]);
                    break;
                case "Friday":
                    System.out.println("Your tasks for " + scedule[5][0] + ": " + scedule[5][1]);
                    break;
                case "Saturday":
                    System.out.println("Your tasks for " + scedule[6][0] + ": " + scedule[6][1]);
                    break;
                case "exit":
                    scan.close();
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

            }

        }
    }

}