import java.io.*;
import java.util.*;
import java.math.*;

public class J01022 {
    static long f[] = new long[93];

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
        fib_init();
        while (t > 0) {
            --t;
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(find(n, k));
        }
        in.close();
        return;
    }

    static void fib_init() {
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < 93; ++i)
            f[i] = f[i-2] + f[i - 1];
    }

    static char find(int i, long k) {
        if (i == 1)
            return '0';
        if (i == 2)
            return '1';
        if (k > f[i-2])
            return find(i - 1, k - f[i- 2]);
        return find(i - 2, k);
    }
}
