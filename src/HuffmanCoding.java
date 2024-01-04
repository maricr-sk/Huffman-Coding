import java.io.File;
import java.util.Scanner;

public class HuffmanCoding {
    private static final String [] HTABLE = new String[26];
    private static final int n = HTABLE.length;

    public static int h(String key){ return key.charAt(0) - 'A'; }

    public void print(){
        System.out.print("[ ");
        for(String da : this.HTABLE){
            System.out.print(da + " ");
        }
        System.out.println("]");
    }


}
