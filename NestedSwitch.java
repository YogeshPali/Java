import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch(empID){
//            case 1:
//                System.out.println("Yogesh Pali");
//                break;
//            case 2:
//                System.out.println("Ritik Roshan");
//                break;
//            case 3:
//                System.out.println("John Paul");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department");
//                }
//                break;
//            default:
//                System.out.println("Enter valid empID");
//        }

        switch (empID) {
            case 1 -> System.out.println("Yogesh Pali");
            case 2 -> System.out.println("Ritik Roshan");
            case 3 -> {
                System.out.println("John Paul");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter valid empID");
        }
    }
}
