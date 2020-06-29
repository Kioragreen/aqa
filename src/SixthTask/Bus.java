package SixthTask;

//6) Create a new class. Make it impossible to create a new object of this class using a constructor.
//   Provide an appropriate public method that will allow clients of your class create a new object.

public class Bus {

    private Bus() {

    }


    public Bus createBus() {
        return new Bus();
    }

}