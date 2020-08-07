package Sixth;

//6. Write a program that will enter numbers from the keyboard.
//        The code for reading numbers from the keyboard must be in the readData method.
//        The code inside the readData is wrapped in a try..catch.
//        If the user entered some text, instead of entering a number, the method should catch the exception and
//        display all previously entered numbers as a result.
//        Numbers output from a new line preserving the order of input.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> temp = new ArrayList();
        try {
            while (true) {
                temp.add(Main.readData());
            }
        } catch (Exception e) {
            System.out.println("You entered not a number. Exit");
            System.out.println(temp);
        }
    }

    static int readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}
