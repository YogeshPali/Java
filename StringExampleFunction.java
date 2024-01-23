import java.util.Scanner;

public class StringExampleFunction {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = mygreet(naam);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String greet = "Hello " + name;
        return greet;
    }

    static String greet(){
        String greeting = "How are you !";
        return greeting;
    }
}
