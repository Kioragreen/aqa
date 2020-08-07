package Second;

//2. Fix the method with try-catch to get the correct result of division

public class Second {

    public static void main(String[] args) {

        System.out.println(divideByZero());

    }

    public static int divideByZero() {
        try {
            int a = 5;

            int b = 0;

            return a / b;
        } catch (Exception error) {
            return 0;
        }

    }
}
