import java.io.*;
import java.util.*;
import java.math.*;

public class J01014 {
    static Vector<Integer> v = new Vector<Integer>();

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
        sieve(100001);
        int t = in.nextInt();
        long n = 0;
        while ( t > 0) {
            --t;
            n = in.nextLong();
            System.out.println(pDiv(n));
        }
        in.close();
        return;
    }

    static long pDiv(long x) {
        long r = 0;
        for (int p : v) {
            if (x % p == 0) {
                r = p;
                while (x % p == 0)
                    x /= p;
            }
            if (x < p)
                break;
        }
        if (x != 1)
            r = x;
        return r;
    }

    static void sieve(int n) {
        boolean[] m = new boolean[n + 1];
        Arrays.fill(m, false);
        v.add(2);
        for (int i = 3; i < n; i += 2)
            if (!m[i])
                for (int j = i; j * 1l * i < n; j += 2)
                    m[j * i] = true;
        for (int i = 3; i < n; i += 2)
            if (!m[i])
                v.add(i);
    }
}
