public class Main {

    public static void main (String[] args){
        System.out.println("Goodbye planet");

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

        System.out.println("\u0048\u0065\u006C\u006C\u006F");

        final int JOY = 5;
//        JOY = 10;

        int[] k = new int[10];
        for(int i=0; i<k.length; i++) {
            k[i] = i+1;
            System.out.println(k[i]);
        }

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
