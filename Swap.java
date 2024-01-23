public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);
        System.out.println(a +" "+b);

        String name = "Yogesh Pali";
        changename(name);
        System.out.println(name);

    }

    static void changename(String name) {
        name="Rahul Rana";//creating new object not modifing the object and strings cannot be modified
                          //Strings are immutable i.e. they cannot be modified they are in the final class
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // This changes will only be valid in this function scope only.

    }
}
