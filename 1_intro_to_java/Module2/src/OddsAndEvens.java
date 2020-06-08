import java.util.Scanner;
import java.util.Random;

public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        char choice = input.next().toUpperCase().charAt(0);
        while (choice != 'O' && choice != 'E'){
            System.out.print("You have made an invalid choice. Please choose between (O)dds or (E)vens: ");
            choice = input.next().toUpperCase().charAt(0);
        }
        switch (choice) {
            case 'O':
                System.out.println(name + " has picked odds! The computer will be odds. ");
                break;
            case 'E':
                System.out.println(name + " has picked evens! The computer will be odds. ");
                break;
        }
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        while (fingers < 0 || fingers > 5){
            System.out.print("You have made an invalid choice. Please put out between 0 and 5 fingers: ");
            fingers = input.nextInt();
        }
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + Integer.toString(computer)  + "\"fingers\"");
        System.out.println("------------------------------------------------------");
        int sum = fingers + computer;
        System.out.println(Integer.toString(fingers)  + " + " + Integer.toString(computer) + " = " + Integer.toString(sum));
        if (sum % 2 == 0){
            System.out.println(Integer.toString(sum)  + " is ... even!");
            if (choice == 'E') System.out.println("That means " + name + " wins! :)");
            else System.out.println("That means the computer wins... :(");
        }
        else{
            System.out.println(Integer.toString(sum)  + " is ... odd!");
            if (choice == 'O') System.out.println("That means " + name + " wins! :)");
            else System.out.println("That means the computer wins... :(");
        }
        System.out.println("------------------------------------------------------");
    }
}