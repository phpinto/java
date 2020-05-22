import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Does player one choose rock, paper or scissors? ");
        String playerOne = input.next();
        System.out.print("Does player two choose rock, paper or scissors? ");
        String playerTwo = input.next();

        if (playerOne.equals(playerTwo)) System.out.println("It's a tie, play again.");
        else if ((playerOne.equals("paper") && playerTwo.equals("rock"))
                || (playerOne.equals("scissors") && playerTwo.equals("paper"))
                || (playerOne.equals("rock") && playerTwo.equals("scissors"))){
            System.out.println("Player 1 wins!");
        }
        else System.out.println("Player 2 wins!");

        /*if (playerOne.equals("rock")) {
            if (playerTwo.equals("scissors")) {
                System.out.println("Player 1 wins!");
            }
            else if (playerTwo.equals("paper")) {
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("It's a tie, play again");
            }
        }
        else if (playerOne.equals("paper")) {
            if (playerTwo.equals("rock")) {
                System.out.println("Player 1 wins!");
            }
            else if (playerTwo.equals("scissors")) {
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("It's a tie, play again");
            }
        }
        else { // playerOne chose Scissors
            if (playerTwo.equals("paper")) {
                System.out.println("Player 1 wins!");
            }
            else if (playerTwo.equals("rock")) {
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("It's a tie, play again");
            }
        }*/
    }
}
