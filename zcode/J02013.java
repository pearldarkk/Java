import java.io.*;
import java.util.*;

public class J02013 {
    public static void main(String args[]) {
        // FileInputStream instream = null;
        // // PrintStream outstream = null;
        // try {
        // instream = new FileInputStream("inp.txt");
        // // outstream = new PrintStream(new FileOutputStream("out.txt"));
        // System.setIn(instream);
        // // System.setOut(outstream);
        // } catch (Exception e) {
        // System.err.println("Error Occurred.");
        // }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();

        int cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            boolean swp = false;
            for (int j = 0; j < n - i - 1; ++j)
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swp = true;
                }
            if (swp) {
                ++cnt;
                System.out.printf("Buoc %d:", cnt);
                for (int k = 0; k < n; ++k)
                    System.out.printf(" %d", a[k]);
                System.out.println();
            }
        }
        in.close();
        return;
    }
}
