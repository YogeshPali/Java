import java.util.Scanner;
public class conditional_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Salary: ");

        int salary = input.nextInt();

        if(salary>=10000){
            salary += 2000;
        }else{
            salary +=1000;
        }
        System.out.println(salary);
    }
}
