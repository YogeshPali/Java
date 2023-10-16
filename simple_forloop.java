import java.util.Scanner;
public class simple_forloop {
    public static void main(String[] args) {
        /*for(int num =1; num<=5;num +=1){
            System.out.println(num);
        }
         */

        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i =1; i<=n;i++){
            System.out.print(i + " ");
        }
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number how many times you want to print Hello World! : ");
        int n = in.nextInt();
        for(int i =1; i<=n;i++){
            System.out.println("Hello World");
        }
    }
}
