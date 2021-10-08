import java.io.*;
import java.util.*;
import java.math.*;

public class J03013 {
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
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger c = BigInteger.ZERO;

        while (t > 0) {
            --t;
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            int len = 0, alen = a.toString().length(), blen = b.toString().length();
            len = alen > blen ? alen : blen;
            c = a.subtract(b).abs();
            if (c.toString().length() < len)
                for (int i = 0; i < len - c.toString().length(); ++i)
                    System.out.print("0");
            System.out.println(c);
        }
        in.close();
        return;
    }
}
