import java.io.*;
import java.util.*;
import java.lang.*;

public class J01012 {
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
        while (t > 0 ) {
            --t;
            System.out.println(eDiv(in.nextInt()));;
        }
        in.close();
        return;
    }

    public static int eDiv(int x) {
        int r = 0;
        while ((x & 1) == 0) {
            ++r;
            x >>= 1;
        }
        if (r == 0)
            return r;

        for (int i = 3; i * i <= x; i += 2) 
            if (x % i == 0) {
                int cnt = 1;
                while (x % i == 0) {
                    x /= i;
                    ++cnt;
                }
                r *= cnt;
            }
        if (x != 1)
            r *= 2;
        return r;
    }
}
