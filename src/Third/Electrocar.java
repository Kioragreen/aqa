package Third;

public class Electrocar extends Car {

    private String model;

    public Electrocar (String model, String name, String size) {
        super(name, size);

        this.model = model;
    }

    boolean isItTesla () {
        return model == "Tesla";
    }

    public static void main (String[] args) {
        Electrocar e = new Electrocar("Tesla", "Model S", "sedan");

        System.out.println("Is It Tesla? " + e.isItTesla());
    }

}
