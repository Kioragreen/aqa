package Fifth;

//5. Throw a NullPointerException from the method iCanThrowException(); Handle it in the main method


public class Main {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException error) {
            System.out.println("Error");
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }

}