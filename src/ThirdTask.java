import java.util.ArrayList;

public class ThirdTask {

//    1. Given string firstName = "Den" and lastName = "Brown". Print to the console the full name
//    in the following format: "FirstName LastName"

    public static void main(String[] args) {
        String firstName = "Den ";
        String lastName = "Brown";
        System.out.println(firstName.concat(lastName));

//        2. Given a string. Write a code that will creates a new string made of its first two chars
//        of the initial string, so the String "Hello" yields "He".
//        If the string is shorter than length 2, return whatever there is, so "X" yields "X",
//        and the empty string "" yields the empty string "".

        String a = "Hello";
        String b = a.substring(0, 2);
        System.out.println(b);

//        3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text.
//        In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
//        Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
//        Task: word = "Welcome to Java World", tag="p"

        String word = "Welcome to Java World";
        String tag1 = "<p>";
        String tag2 = "</p>";
        System.out.println(tag1.concat(word.concat(tag2)));

//        4. Given two strings. Check if they start with "The". Task: word1 = "The End", word2="End The";

        String word1 = "The End";
        String word2="End The";
        System.out.println(word1.startsWith("The"));
        System.out.println(word2.startsWith("The"));

//        5. Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.

        String c = "ABCDEFGHIJK";
        String lowerCased = c.toLowerCase();
        System.out.println(lowerCased);
        String withoutVowels = lowerCased
                .replaceAll("a|e|i", "");
        System.out.println(withoutVowels);

//        6. Given 2 strings, d and e. Create a string c of the form short+long+short, with the shorter string
//        on the outside and the longer string on the inside. Task: d = "hop", e = "hello"

        String d = "hop";
        String e = "hello";
        if(d.length() > e.length()){
            System.out.println(e + d + e);
        } else
            System.out.println(d + e + d);

//        7. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain"
//        which will be substrings of full email address. The First Name and Last Name of the user should be
//        in the following format: "Name Surname".

        String f = "john_smith@example.com";
        String[] result = f.split("@"); // ["john_smith", "example.com"]
        String[] name = result[0].split("_"); // ["john", "smith"]
        System.out.println(name[0] + " " + name[1]);
        System.out.println(result[1]);

//        8. Given a string "Den, John, Will, Kate, Adam, Robin".
//        Print all the names from the following string each from a new line. Example: Den John Will Kate...

        String names = "Den, John, Will, Kate, Adam, Robin";
        String[] results = names.split(", ");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }

//        9. Given some random string s. Verify if that string ends with ".".
//        If so, leave this string as is. If not - add it. Test strings create on your own.
//
        String some = "I'm just a simple russian girl";
        if(some.endsWith(".")) {
            System.out.println(some);
        } else
            System.out.println(some + ".");

//       10. Write a program which prints "Hello world" to the console using methods
//        transformIntToChar and printList only.

        ThirdTask.printList(ThirdTask.transformIntToChar(72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
}
