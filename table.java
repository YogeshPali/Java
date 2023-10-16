import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        for(int i=1;i<= 10; i++){
            int sum = num * i;
            System.out.println(num + " * " + i + " =" + sum);
        }
    }
}
