package Second;

public class KelvinConverter implements Converter {

    @Override
    public void convert(double celsius) {
        System.out.println(celsius + 273.15);
    }

//    public static void main(String[] args) {
//        Converter conv = new KelvinConverter();
//        conv.convert(67);
//    }
}
