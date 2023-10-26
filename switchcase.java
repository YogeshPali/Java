import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("Healthy fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Write the appropriate fruit name");
        }
    }
}
