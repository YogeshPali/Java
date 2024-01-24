import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,7,5,4,3,3,23,34,4);
//        multiple(2,3,"Yogesh","Kunal", "Rohit","dbdhbfj");
        demo("Yogesh", "Rohit","Virat");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b, String ...v){
        System.out.println(a + " "+ b + Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
