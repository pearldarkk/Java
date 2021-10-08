import java.io.*;
import java.util.*;
import java.math.*;

public class J03011 {
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
            long a = in.nextLong();
            BigInteger bb = in.nextBigInteger();
            long b = bb.mod(BigInteger.valueOf(a)).longValue();
            System.out.println(gcd(a, b));
        }
            in.close();
            return;
    }
    static long gcd(long a, long b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
