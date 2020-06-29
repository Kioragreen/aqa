package EleventhTask;

//11) Create a class with two different methods and two fields. One of methods should be static, another - non-static.
//        The same thing should be done with class fields(first - static, second - non-static).
//        These two methods should change the corresponding fields of the class when called.
//        Create another class with main method to test your code.

public class Main {

    public static void main (String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.legs);
        System.out.println(animal.getLegs());

        System.out.println(Animal.name);
        System.out.println(Animal.getName());

    }
}
