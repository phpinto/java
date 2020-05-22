import java.util.*;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What was your overall grade percentage?");
        int grade = input.nextInt();
        if (grade > 60) {
            System.out.println("Admitted!");
        }
        else if (grade > 40) {
            System.out.println("You have been waitlisted.");
        }
        else {
            System.out.println("Please apply again.");
        }
    }
}
