import java.util.Arrays;
public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Yogesh";
        char target ='e';
        boolean ans = search(name,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean ans2 = search2(name,target);
        System.out.println(ans2);
    }

    static boolean search2(String str, int target){
        if(str.length()==0){
            return false;
        }
        for(char ca: str.toCharArray()){
            if(ca==target){
                return true;
            }

        }
        return false;
    }
    static boolean search(String str ,int target){
        if(str.length()==0){
            return false;
        }
        for (int i =0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
