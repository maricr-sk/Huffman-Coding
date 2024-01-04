import java.io.File;
import java.util.Scanner;

public class Tester<minHeap> {
    private static final String [] HTABLE = new String[26];
    private static final int n = HTABLE.length;
    private Integer minHea = new minHeap();

    public static void insert(String key){
        if(!findS(key)) {
            int index = h(key);
            int i = 0;
            while ( (!HTABLE[(index + i) % n].equals("-") && !HTABLE[(index + i) % n].equals("*")) && i < n){
                i++;
            }
            if (i == n) return;
            HTABLE[(index + i) % n] = key;
        }
    }

    public static boolean findS (String key) {
        return find(key) != -1;
    }

    public static int find(String key) {
        //which index it is found
        int index = h(key);
        int i = 0;
        while ((!HTABLE[(index + i) % n].equals("-") || !HTABLE[(index + i) % n].equals("*")) && i < n) {
            i++;
        }
        if (i >= n) return -1;
        return i;
    }

    public static int h(String key){ return key.charAt(0) - 'A'; }

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(new File(args[0]));
        int T = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < T; i++) {
            String [] temp = scan.nextLine().split(" ");
            int [] demo = new int [temp.length];

            for(int j = 0; j < temp.length; ++j){ demo[j] = Integer.parseInt(temp[j]); }

            HuffmanCoding ms = new HuffmanCoding(demo);
            ms.print();
            ms.sort();
            ms.print();}
    }

}
