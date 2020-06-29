package FifthTask;

public class Girl {
    Boy boyfrend = new Boy();

    public String getBoyfrendName () {
        // boyfrend.height = 100; // ERROR private access
        return boyfrend.name;
    }
}
