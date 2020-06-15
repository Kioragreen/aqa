public class Human {

//    1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
//            Requirements:
//    a) Create a class Human with all the required fields to store the information
//(variable types you could choose by yourself).
//    b) Add to the class a constructor with parameters which initialize all the fields.

    double weight;
    int age;
    String firstName;
    String lastName;
    double height;

    Human(double w, int a, String name, String surname, double h) {
        this.weight = w;
        this.age = a;
        this.firstName = name;
        this.lastName = surname;
        this.height = h;
        System.out.println(this.firstName + " " + this.lastName + " " + this.age + " " + this.height + " " + this.weight);
    }
}

//6. Create a simple class with any 3 fields. Demonstrate in your class how we can use "this" keyword to refer to
//        the object, from which a constructor or a method was invoked.
class Man{
    String hairStyle;
    String eyesColor;
    int size;

    Man (String hair, String eyes, int s) {
        this.hairStyle = hair;
        this.eyesColor = eyes;
        this.size = s;
        System.out.println(this.eyesColor + this.hairStyle);
    }
}












