package Overloaded;

//10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

public class Overloaded {

        public void over(char c)
        {
            System.out.println(c);
        }
        public void over(char c, int num)
        {
            System.out.println(c + " " + num);
        }
    }
    class Simple
    {
        public static void main(String args[])
        {
            Overloaded obj = new Overloaded();
            obj.over('a');
            obj.over('a',5);
        }
    }

