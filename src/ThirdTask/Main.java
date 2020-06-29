package ThirdTask;

//3) Answer the question: What is a package-private access? Create a simple program to demostrate the package-private access.
//   Tips:
// - Create two different packages
// - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
// - Create in one of the classes some package-private members(fields or methods).
// - In another two classes create objects of the class with package-private members and try to access its members.

//4) Answer the question: What is a public access? Create a simple program to demonstrate the public access.
//   You can use tips from the task 3.


import ThirdTask.Animals.Horse;
import ThirdTask.Animals.Monkey;
import ThirdTask.Birds.Flamingo;

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Monkey monkey = new Monkey();
        Flamingo bird = new Flamingo();

//        System.out.println(bird.height);
          System.out.println(horse.price);

    }
}



