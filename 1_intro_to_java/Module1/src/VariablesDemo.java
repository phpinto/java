public class VariablesDemo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("My variable x contains " + x);
        x = 15;
        System.out.println("My variable x contains " + x);
        x = 225;
        myMethod(x);
    }

    public static void myMethod(int x) {
        String myString = "My variable x contains ";
        System.out.println(myString + x);
    }
}
