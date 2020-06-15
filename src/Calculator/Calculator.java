package Calculator;
//4. Create a class Calculator. It should have three fields: double first, double second and String operation.
//   Create all required constructors to properly initialize your object.
//   Consider the case when user does not provide any parameters when creates a new object.
//   Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
//   Write the test class which contains the main method. In this main method you should create your Calculator object
//   and do some calculation to test your code, by calling your "calculate" method. Print all results to the console.


public class Calculator {

    double first;
    double second;
    String operation;

    Calculator (double firstV, double secondV, String operation) {
        this.first = firstV;
        this.second = secondV;
        this.operation = operation;
    }

    Calculator () {
        this.first = 0;
        this.second = 0;
        this.operation = "";
    }

    Double calculate () {
        if (operation.equals("+")) {
            return first + second;
        } else if (operation.equals("-")) {
            return first - second;
        } else if (operation.equals("/")) {
            return first / second;
        } else if (operation.equals("*")) {
            return first * second;
        }
        return null;

    }
}

class Test {

    public static void main(String[] args) {

        System.out.println(new Calculator(10, 15, "+").calculate());
        System.out.println(new Calculator(10, 15, "-").calculate());
        System.out.println(new Calculator(10, 15, "/").calculate());
        System.out.println(new Calculator(10, 15, "*").calculate());
    }
}
