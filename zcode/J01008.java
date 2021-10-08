import java.io.*;
import java.util.*;

public class J01008 {
    public static void main(String args[]) {
        FileInputStream instream = null;
        // PrintStream outstream = null;
        try {
            instream = new FileInputStream("inp.txt");
            // outstream = new PrintStream(new FileOutputStream("out.txt"));
            System.setIn(instream);
            // System.setOut(outstream);
        } catch (Exception e) {
            System.err.println("Error Occurred.");
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        for (int i = 0; i < n; ++i) {
            System.out.printf("Test %d:", i + 1);
            x = in.nextInt();
            prime(x);
        }
        in.close();
        return;
    }

    public static void prime(int x) {
        for (int i = 2; i * i <= x; ++i)
            if (x % i == 0) {
                int cnt = 0;
                while (x % i == 0) {
                    ++cnt;
                    x /= i;
                }
                System.out.printf(" %d(%d)", i, cnt);
            }
        if (x != 1) 
            System.out.printf(" %d(1)", x);
        System.out.println();
    }
}
