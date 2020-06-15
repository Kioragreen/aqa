package FourthTask;

public class Car {
    Wheels wheels;
    Engine engine = new Engine(100);

    public Car(Wheels wheels) {
        this.wheels = wheels;
    }
}
