import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {
        intro();
        budget();
        time();
        distance();
    }
    public static void intro() {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String city = sc.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");
        System.out.println("***********");
    }
    public static void budget() {
        System.out.println();
        System.out.println();
        System.out.print("How many days are you going to spend travelling? ");
        Scanner sc = new Scanner(System.in);
        double days = sc.nextDouble();
        System.out.print("How much money, in USD are you planning to spend on your trip? ") ;
        double money = sc.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = sc.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double rate = sc.nextDouble();

        System.out.println();
        System.out.println();

        double hours = Math.round(days * 24 * 100)/100.00;
        double minutes = Math.round(hours * 60 * 100)/100.00;
        double per_day = Math.round((money/days) * 100)/100.00;
        double converted = Math.round(rate * money * 100)/100.00;
        double converted_per_day = Math.round((converted/days) * 100)/100.00;

        days = Math.round(days * 100)/100.00;
        String days_string = ((days % 1 == 0) ? Integer.toString((int) days) : Double.toString(days));
        String hours_string = ((hours % 1 == 0) ? Integer.toString((int) hours) : Double.toString(hours));
        String minutes_string = ((minutes % 1 == 0) ? Integer.toString((int) minutes) : Double.toString(minutes));
        System.out.println("If you are travelling for " + days_string + " days that is the same as " + hours_string + " hours or " + minutes_string + " minutes");


        money = Math.round(money * 100)/100.00;
        String money_string = ((money % 1 == 0) ? Integer.toString((int) money) : Double.toString(money));
        String per_day_string = ((per_day % 1 == 0) ? Integer.toString((int) per_day) : Double.toString(per_day));
        System.out.println("If you are going to spend $" + money_string + " that means per day you can spend up to $" + per_day_string + " USD");

        String converted_string = Double.toString(converted);
        String converted_per_day_string = Double.toString(converted_per_day);
        System.out.println("Your total budget in " + currency + " is " + converted_string + " " + currency + ", which per day is " + converted_per_day_string + " " + currency);
        System.out.println("***********");
    }
    public static void time() {
        System.out.println();
        System.out.println();
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Scanner sc = new Scanner(System.in);
        double hours = sc.nextDouble();

        double midnight = Math.round(((24 + hours) % 24) * 100) / 100.00;
        double noon = Math.round(((36 + hours) % 24) * 100) / 100.00;
        double dec = Math.abs(hours) - (int) Math.abs(hours);
        String midnight_string = "";
        String noon_string = "";
        if (dec < 0.1) {
            midnight_string = Integer.toString((int) midnight) + ":0" + Integer.toString((int) (dec * 60));
            noon_string = Integer.toString((int) noon) + ":0" + Integer.toString((int) (dec * 60));
        } else {
            midnight_string = Integer.toString((int) midnight) + ":" + Integer.toString((int) (dec * 60));
            noon_string = Integer.toString((int) noon) + ":" + Integer.toString((int) (dec * 60));
        }
        System.out.println("That means that when it is midnight at home it will be " + midnight_string + " in your travel destination and when it is noon at home it will be " + noon_string);
        System.out.println("***********");
    }

    public static void distance() {
        System.out.println();
        System.out.println();
        System.out.print("What is the square area of your destination country in km2? ");
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble();
        area = Math.round((area/2.58998811) * 100) / 100.00;
        String area_string = ((area % 1 == 0) ? Integer.toString((int) area) : Double.toString(area));
        System.out.println("In miles2 that is " + area_string);
        System.out.println("***********");
    }
}
