public class EvenDigitsLeetCode1295 {
    public static void main(String[] args) {
        int[] arr = {12,324,2432,43,2,342};
        System.out.println(findNumbers(arr));
        System.out.println("It will print number of digit in any number: " + digits(-123432));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }return count;
    }

    //function to check whether the no. contain even digit or not
    static boolean even(int num) {
        return digits(num) % 2 == 0;
        /*
        if(nodigit(num) % 2 ==0){
            return true;
        }
        return false;
         */
    }

    //count number of digits in a number
    static int digits(int num){
        if(num<0){
            num = num*-1;
        }
        int count =0;
        while(num>0){
            count++;
            num=num/10; // num /= 10;
        }
        return count;
    }
}
