import java.util.Scanner;

public class whileLoopsDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        String answer = input.next();
        while (answer.equals("hello")){
            System.out.println("hello");
            answer = input.next();
        }
        System.out.println("goodbye");
    }
}