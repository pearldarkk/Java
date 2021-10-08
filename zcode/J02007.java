import java.io.*;
import java.util.*;

public class J02007 {
    public static void main(String args[]) {
        // FileInputStream instream = null;
        // // PrintStream outstream = null;
        // try {
        //     instream = new FileInputStream("inp.txt");
        //     // outstream = new PrintStream(new FileOutputStream("out.txt"));
        //     System.setIn(instream);
        //     // System.setOut(outstream);
        // } catch (Exception e) {
        //     System.err.println("Error Occurred.");
        // }
    
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int t = in.nextInt();
        
        for (int q = 1; q <= t; ++q) {
            System.out.printf("Test %d:%n", q);
            int n = in.nextInt();
            int[] a = new int [n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                if (m.containsKey(a[i]))
                    m.put(a[i], m.get(a[i]) + 1);
                else
                    m.put(a[i], 1);
            }
            for (int i = 0; i < n; ++i) 
                if (m.containsKey(a[i])) {
                    System.out.printf("%d xuat hien %d lan%n", a[i], m.get(a[i]));
                    m.remove(a[i]);
                }
            m.clear();
        }
        in.close();
        return;
    }

    public static boolean prime(int x) {
        for (int i = 2; i * i <= x; ++i)
            if (x % i == 0)
                return false;
        return true;
    }
}
