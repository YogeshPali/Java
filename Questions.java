import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = in.nextInt();
//        System.out.println(primenumber(num));
//        System.out.println(isArmstrong(num));
        for(int i = 100; i<=1000;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int remainder = n%10;
            n = n/10;
            sum = sum + remainder*remainder*remainder;
        }
        //return sum==original;
        if (sum == original) {
            return true;
        }
        return false;
    }

    static boolean primenumber(int num){
        if(num<=1){
            return false;
        }
        int c =2;
        while(c*c <=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        if(c*c > num){
            return true;
        }
        return false;


    }
}
