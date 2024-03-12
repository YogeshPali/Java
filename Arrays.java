import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        //Q: store the roll number
        int a =10;

        //Q: store the person's name
//        String name = "Yogesh Pali";

        //Q: store 5 roll numbers
        int rno1 = 12;
        int rno2 = 13;
        int rno3 = 14;
        int rno4 = 15;
        int rno5 = 16;

        //syntax of array
        // datatype[] variable_name = new datatype[size]
        //store 5 roll no.
        int[] rollno = new int[5];
        // or directly
        int[] rno = {12,13,45,32,22};

        int[] rlno; // declaration of array rlno is defined in stack
        rlno = new int[5]; // initialization: actually here object is being created in the memory(heap)
//        System.out.println(rlno[1]);

        //null a = null; it is wrong
        
        String[] name = new String[4];
        System.out.println(name[0]);

    }
}
