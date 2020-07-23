package Third;

public class MyDevice implements State, Volume {

    @Override
    public void on() {
        System.out.println("Device is ON");
    }

    @Override
    public void off() {
        System.out.println("Device is OFF");
    }

    @Override
    public void changeVolume(double value) {
        System.out.println("Make some noise");
    }
}
