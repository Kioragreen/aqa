package Rat;

//5. Create a simple class with a bunch of constructors. All these constructors should take different number of parameters.
//        Demonstrate in your class, how we can call one constructor from another.

public class Rat {
        int age;
        String color;
        String name;

        public Rat (String name) {
            this.name = name;
            System.out.println("Melon");
        }

        public Rat (String name, int age) {
            this(name);
            this.age = age;
            System.out.println(1);
        }

        public Rat (String name, int age, String color) {
            this(name, age);
            this.color = color;
            System.out.println("grey");
        }
    }
 class Main {
     public static void main(String[] args) {
         Rat a = new Rat ("Melon", 1, "grey");
         System.out.println(a.name);
    }

 }