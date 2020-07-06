package Fourth;


//4) Create a class A. Add several fields, two methods and parameterized constructors to it.
//        Create a class B that extends class A.
//        Demonstrate in you program how class's B constructor should call class's A constructor to create a new object.
//        Override one method of the class A to fully change it's behavior.
//        Override another method to add some extra functionality to it, but it should then call class's A method.
//        Create a test class and create several objects of class A and class B and call their methods.

public class A {
    String name;
    int age;
    int id;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public A (String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
