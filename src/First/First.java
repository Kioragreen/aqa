package First;

//1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0
//        throw your own exception.

public class First {
    void a(int num) throws Exception {
        if (num < 0)
            System.out.println("Number < 0");
        if (num > 0)
            System.out.println("Number > 0");
        if (num ==  0)
            throw new Exception("Error");
    }
}
