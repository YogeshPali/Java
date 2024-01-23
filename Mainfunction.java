import java.util.Scanner;

public class Mainfunction {
    public static void main(String[] args) {
//        int ans=sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }
    //return value

    //pass the value of numbers when you are calling the method from main().

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum =" + sum);
    }
}
