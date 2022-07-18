public class Main {
    public static void main(String[] args) {
        println(sum(5, 10));
        println(sum(5.2f, 6.3f));
        println(sum(7.6, 8.8));
    }
    static int sum(int number1, int number2) {
        return number1 + number2;
    }
    static float sum(float number1, float number2) {
        return number1 + number2;
    }
    static double sum(double number1, double number2) {
        return number1 + number2;
    }
    static void println(double number) {
        System.out.println(number);
    }
    static void println(int number) {
        System.out.println(number);
    }
    static void println(float number) {
        System.out.println(number);
    }
}