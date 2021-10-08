import java.io.*;
import java.util.*;
import java.math.*;

public class J02014 {
    static int[] a = new int[100001];
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
        while (t > 0) {
            --t;
            int n = in.nextInt();
            for (int i = 0; i < n; ++i)
                a[i] = in.nextInt();
            System.out.println(equPoint(n));
        }
        in.close();
        return;
    }

    static int equPoint(int n) {
        int rsum = 0, lsum = 0;
        for (int i = 1; i < n; ++i)
            rsum += a[i];

        for (int i = 1; i < n; ++i) {
            lsum += a[i - 1];
            rsum -= a[i];
            if (lsum == rsum)
                return i + 1;
        }
        return -1;
    }
}
