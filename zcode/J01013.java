import java.io.*;
import java.util.*;
import java.math.*;

public class J01013 {
    static long r = 0;
    static int[] v = new int[2000001];

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

        sieve(2000001);
        int t = in.nextInt();

        while (t > 0) {
            --t;
            int n = in.nextInt();
            pDivs(n);
        }
        System.out.println(r);
        in.close();
        return;
    }

    static void pDivs(int x) {
        while (x > 1) {
            r += v[x];
            x /= v[x];
        }
    }

    static void sieve(int n) {
        boolean[] m = new boolean[n + 1];
        Arrays.fill(m, false);
        for (int i = 2; i < n; i += 2)
            v[i] = 2;
        for (int i = 3; i < n; i += 2)
            if (!m[i]) {
                v[i] = i;
                for (int j = i; j *1l * i < n; j += 2) {
                    m[j * i] = true;
                    v[j * i] = i;
                }
            }
    }
}
