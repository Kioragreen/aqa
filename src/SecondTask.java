public class SecondTask {
//    1) Create a simple program, that creates two integers and print the result of calculation of their addition, substruction,
//    multiplication and division.

    public static void main (String[] args) {
        int a = 89;
        int b = 9;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double)b);

//        2) Create a simple program that calculates and prints the square of a rectangle and a circle. Import and use Math class.
//        Circle

        int radius = 5;
        double circleArea = Math.PI * radius * radius;
        System.out.println(circleArea);

        //Rectangle
        int o = 5;
        int p = 7;
        int rectangle = o * p;
        System.out.println(rectangle);

//        3) Create an array of 10 integers. Fill this array using for-loop with random numbers. Print all the elements of this
//        array to the console. Each element from the new line.
        int[] k = new int[10];
        for(int i=0; i<k.length; i++) {
            k[i] = (int)Math.floor(Math.random() * 10);
            System.out.println(k[i]);
        }

//       4) Create an array of 10 integers. Find the square root of each element and put the to result array.
//                Print the result array to the console.

        int[] t = new int[10];
        for(int i=0; i<t.length; i++) {
            t[i] = (int) Math.floor(Math.random() * 10);
        }
        double[] s = new double[10];
        for(int i=0; i<t.length; i++) {
            s[i] = Math.sqrt(t[i]);
            System.out.println(s[i]);
        }

        //5) Create a program that calculates the factorial of an integer value n.

        int n = 5;
        int result = 1;
        for(int i=1; i<=n; i++) {
            result = result * i;
        }
        System.out.println(result);

//        6) Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").
//            a)

        for(int i=0; i<8; i++) {
            System.out.println("********");
        }

//        b)

        for(int i=0; i<5; i++) {
            if(i == 0 || i == 4) {
                System.out.println("********");
            } else {
                System.out.println("*      *");
            }
        }


        //c)

        for(int i=1; i<=8; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        d)

        int lines = 5;
        int maxAsteriscs = (lines * 2) - 1;
        for(int i=1; i<=lines; i++) {
            int numOfAsteriscs = (i * 2) - 1;
            for (int j = 1; j <= (maxAsteriscs - numOfAsteriscs) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numOfAsteriscs; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        7) Create an array of 10 integers. Calculate and print the sum of all its elements except the first one and the last one.

        int[] w = new int[10];
        for(int i=0; i<w.length; i++) {
            w[i] = (int) Math.floor(Math.random() * 10);
        }

        int res = 0;
        for(int i = 1; i < w.length - 1; i++) {
            res = res + w[i];
        }

//        8) Print all the numbers from 1 to 100 that are divisible by 3 or divisible by 5, but not divisible by 2.

        int[] numbers = new int[100];
        for(int i=0; i<numbers.length; i++) {
            if((i % 3 == 0 || i % 5 == 0) && i % 2 != 0){
                System.out.println(i);

            }
        }

//        9) Create an array of any length and fill it with random integers. Using loops and conditions sort
//        this array and print it out to the console. You can use any sorting algorithm you want.
//        Do not use build-in methods to sort the array.

        int[] arr = new int[50];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }
        int q = arr.length;
        for (int i = 0; i < q-1; i++)
            for (int j = 0; j < q-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

        for(int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
