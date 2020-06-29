package SecondTask;


//2) Take the classes from the task 1. Create a new test class. Import everything (*) from your created packages.
//   Now try to create objects of your classes without specifying the packages in front of the class names.
//   What happened? How can we avoid this?

import SecondTask.Cat.*;
import SecondTask.Dog.*;

public class Main {
    public static void main(String[] args) {
//        Body body = new Body();
        SecondTask.Cat.Body body = new SecondTask.Cat.Body();
    }
}
