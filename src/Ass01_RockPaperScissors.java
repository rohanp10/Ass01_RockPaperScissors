import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String continueYN = "";

        String trash = "";
        boolean done = false;

        boolean gameContinue = true;


        do {

            do {
                System.out.print("\nPlayer A: Enter a move [R, P, S] or [r, p, s]: ");

                if (in.hasNext()) {
                    playerA = in.nextLine();

                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                        done = true;
                    } else {
                        System.out.println("\nYou said your move was: " + playerA);
                        System.out.println("You have to choose a valid move [R, P, S] or [r, p, s]");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("\nYou said your move was: " + trash);
                    System.out.println("You have to choose a valid move [R, P, S] or [r, p, s]");

                }
            }
            while (!done);

            done = false;

            do {
                System.out.print("Player B: Enter a move [R, P, S] or [r, p, s]: ");

                if (in.hasNext()) {
                    playerB = in.nextLine();

                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                        done = true;
                    } else {
                        System.out.println("\nYou said your move was: " + playerB);
                        System.out.println("You have to choose a valid move [R, P, S] or [r, p, s]\n");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("\nYou said your move was: " + trash);
                    System.out.println("You have to choose a valid move [R, P, S] or [r, p, s]\n");

                }
            }
            while (!done);

            done = false;

            System.out.print("\n");

            if (playerA.equalsIgnoreCase("R")) {

                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, it's a Tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                }

            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, it's a Tie!");
                } else {
                    System.out.println("Scissors cuts Paper, Player B wins!");
                }

            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors, it's a Tie!");
                }
            }

            do {

                System.out.print("\nDo you want to play again [Y/N]: ");

                if (in.hasNext()) {
                    continueYN = in.nextLine();

                    if (continueYN.equalsIgnoreCase("Y") || continueYN.equalsIgnoreCase("N")) {

                        done = true;

                        if (continueYN.equalsIgnoreCase("N"))
                            gameContinue = false;

                    } else {
                        System.out.println("\nYou said your choice was: " + continueYN);
                        System.out.println("You have to choose a valid option [Y/N]");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("\nYou said your choice was: " + trash);
                    System.out.println("You have to choose a valid option [Y/N]");

                }
            }
            while (!done);

            done = false;
        }
        while (gameContinue);
    }
}