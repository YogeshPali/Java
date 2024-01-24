public class Overloading {
    public static void main(String[] args) {
//        fun(20);
//        fun("Yogesh pali");
        int ans = sum(20,30);
        System.out.println(ans);

        int result = sum(20,30,40);
        System.out.println(result);

    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);

    }
}
