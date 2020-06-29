package NinthTask;

//9) What is the different between static and non-static field of a class? Create an example to demonstrate this concept.

public class Example {
    static String name = "Some example";
    int age = 10;

    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println(ex.age);
        System.out.println(Example.name);
    }
}
