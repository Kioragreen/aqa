package Recursive;

//9. Write your own example of the recursive function. You can find a lot of examples on the Internet.

public class Recursive {

    void recursive () {
        recursive();
    }

    public static void main(String[] args) {
        new Recursive().recursive();
    }
}