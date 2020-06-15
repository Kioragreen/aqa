package Person;

//7. Create a simple class with some fields. Demonstrate in your class how we can use initialization blocks.

public class Person {

    String sex = "Woman";

    private String status;
    private int age;

     int id;
     String name;
     String surname;

    {
        status = "hidden";
        System.out.println(status);
    }
}
