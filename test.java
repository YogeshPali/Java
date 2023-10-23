import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String shape = in.nextLine();
        System.out.println(shape);

        if (shape.equals("Yogesh Pali")) {
            System.out.println("It's my name.");
        } else {
            System.out.println("It's not my name");
        }
    }
}
