import java.io.*;
import java.util.*;

public class J01011 {
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
        for (int i = 0; i < t; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a * 1l * b / gcd(a, b) + " " + gcd(a, b));
        }
        in.close();
        return;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
