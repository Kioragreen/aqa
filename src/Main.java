public class Main {

    //1) Write a simple Java program using any text editor. Compile this program using Java compiler and run it from the console.

    public static void main (String[] args){
        System.out.println("Goodbye planet");

//        2) Write a program which creates and initializes all primitive data types.

        byte a = 15;
        System.out.println(a);

        int b = 1647;
        System.out.println(b);

        boolean c = true;
        System.out.println(c);

        char d = 'g';
        System.out.println(d);

        short e = 7;
        System.out.println(e);

        long f = 469348308;
        System.out.println(f);

        double g = 56.8;
        System.out.println(g);

        float h = 12.8f;
        System.out.println(h);

//        5) Read about ASCII. Write unicodes for all characters in a word "Hello".

                System.out.println("\u0048\u0065\u006C\u006C\u006F");

//        6) Create a simple program with several constants.

        final int JOY = 5;
//        JOY = 10;

//        7) Create an array of 10 integers. Initialize this array with any values except 0.
//        Print the length of the array to a console.

        int[] k = new int[10];
        for(int i=0; i<k.length; i++) {
            k[i] = i+1;
            System.out.println(k[i]);
        }
//        8) Create an array of 5 doubles. Get the first and the last element of the array an write them to variables.

        double[] l = new double[5];
        for(int i=0; i<l.length; i++) {
            l[i] = i+1.5;
        }
        double first = l[0];
        double last = l[l.length - 1];
        System.out.println(first);
        System.out.println(last);


    }
}
