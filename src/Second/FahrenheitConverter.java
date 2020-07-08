package Second;

public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double celsius) {
        System.out.println((celsius * 9/5) + 32);
    }
}
