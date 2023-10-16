import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        if (num<=1){
            System.out.println("Neither prime nor composite");
        }
        int count =0;
        for (int i = 1;i<=num;i++){
            if(num%i==0){
                count++;
            }}
        if (count ==2){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not prime number");
        }
    }
}
