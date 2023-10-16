import java.util.Scanner;
public class multiple_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the salary: ");
        int salary = input.nextInt();

        if(salary>=20000)
            salary+=2000;
        else if(salary>=10000)
            salary+=1000;
        else
            salary+=500;

        System.out.println(salary);
    }
}
