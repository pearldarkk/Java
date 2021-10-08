import java.io.*;
import java.util.*;
import java.math.*;

public class J01021 {
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
        int a = 1;
        long b = 1;
        while (true) {
            a = in.nextInt();
            b = in.nextLong();
            if (a == 0 && b == 0)
                break;
            System.out.println(pwr(a, b, 1000000007));
        }
        in.close();
        return;
    }

    static long pwr(long a, long b, int mod) {
        long r = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1)
                r = (a *1l* r) % mod;
            a = (a *1l* a) % mod;
            b >>= 1;
        }
        return r;
    }
}
