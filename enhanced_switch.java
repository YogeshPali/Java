import java.util.Scanner;

public class enhanced_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("Healthy fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Write the appropriate fruit name");
//        }
        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("write the appropriate no. of day");
        }
    }
}
