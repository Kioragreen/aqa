package FourthTask;
//        3. Create 3 different classes to demonstate the relationships "has-a" and "uses-a".
//        They can be anything you want. For example: Car - Engine - Wheels

public class Main {
    public static void main(String[] args) {
        Wheels wheels = new Wheels(15);

        Car myCar = new Car(wheels);
        System.out.println(myCar.wheels.radius);
        System.out.println(myCar.engine.power);
    }
}
