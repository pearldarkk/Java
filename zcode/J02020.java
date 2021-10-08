import java.io.*;
import java.util.*;
import java.math.*;

public class J02020 {
    static int n = 0;
    static int k = 0;
    static int[] a = new int[11];
    static int cnt = 0;

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
        n = in.nextInt();
        k = in.nextInt();
        bt(1);
        System.out.printf("Tong cong co %d to hop", cnt);
        in.close();
        return;
    }

    static void bt(int p) {
        for (int i = a[p - 1] + 1; i <= n - k + p; ++i) {
            a[p] = i;
            if (p == k) {
                ++cnt;
                for (int j = 1; j <= k; ++j)
                    System.out.printf("%d ", a[j]);
                System.out.println();
            } else
                bt(p + 1);
        }
    }
}
