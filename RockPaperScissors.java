import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final String Rock = "Rock";
        final String Paper = "Paper";
        final String Scissors = "Scissors";
        System.out.printf("How many games do you want to play?%n");
        int numberOfGames = Integer.parseInt(scanner.nextLine());

        int yourWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= numberOfGames; i++) {


            System.out.printf("%nChoose [r]ock, [p]aper, [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = Rock;
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = Paper;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = Scissors;
            } else {
                System.out.println("Invalid output. Try Again...");
                return;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);
            String computerMove = "";

            switch (computerRandomNumber) {
                case 0:
                    computerMove = Rock;
                    break;
                case 1:
                    computerMove = Paper;
                    break;
                case 2:
                    computerMove = Scissors;
                    break;
            }
            System.out.printf("Computer choose %s%n", computerMove);

            if (playerMove.equals(Rock) && computerMove.equals(Scissors) ||
                    playerMove.equals(Paper) && computerMove.equals(Rock) ||
                    playerMove.equals(Scissors) && computerMove.equals(Paper)) {
                System.out.println("You win this round.");
                yourWins += 1;
            } else if (playerMove.equals(Rock) && computerMove.equals(Paper) ||
                    playerMove.equals(Paper) && computerMove.equals(Scissors) ||
                    playerMove.equals(Scissors) && computerMove.equals(Rock)) {
                System.out.println("You lose this round.");
                computerWins += 1;
            } else {
                System.out.println("This was a draw.");
            }
        }
        if (yourWins > computerWins){
            System.out.printf("%nCongratulations!!! You won the game!");
        } else if (yourWins < computerWins) {
            System.out.printf("%nSorry! You lost this game! Better luck next time");
        }
        else {
            System.out.printf("%nThis was a draw game.");
        }
    }
}