import java.io.*;
import java.util.*;
import java.math.*;

public class J08015 {
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
        int t = in.nextInt();
        int n = 0, k = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] a = new int[100001];
        while (t > 0) {
            --t;
            n = in.nextInt();
            k = in.nextInt();
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
                if (!m.containsKey(a[i]))
                    m.put(a[i], 1);
                else
                    m.put(a[i], m.get(a[i]) + 1);
            }
            long r = 0;
            for (int i = 0; i < n; ++i) {
                if (m.containsKey(k - a[i]))
                    r += m.get(k - a[i]);
                if (k - a[i] == a[i])
                    --r;
            }
            m.clear();
            System.out.println(r / 2);
        }
        in.close();
        return;
    }
}
