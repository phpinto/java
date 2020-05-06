public class MathOperationsDemo {
    public static void main(String[] args) {
        double x = 10;
        int y = 3;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

        x++;
        y *= 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
