import java.util.Scanner;
public class switch_case {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 7 for to print the day: ");
        int number = in.nextInt();

//        switch(number){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Satirday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Write the appropriate no. for the day");
//        }

        // Enhanced switch statement:

//        switch (number) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter appropriate no. for to print day");
//        }

        // Weekdays and Weekends
//        switch (number) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//            default:
//                System.out.println("Enter appropriate no. for to print day");
//                break;
//        }

        switch (number) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("Enter appropriate no. for to print day");
        }
    }
    }

