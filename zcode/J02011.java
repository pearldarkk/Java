import java.io.*;
import java.util.*;

public class J02011 {
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
        int imin = -1;
        for (int i = 0; i < n - 1; ++i) {
            imin = i;
            for (int j = i + 1; j < n; ++j)
                if (a[imin] > a[j])
                    imin = j;
            int tmp = a[i];
            a[i] = a[imin];
            a[imin] = tmp;
            System.out.printf("Buoc %d:", i + 1);
            for (int k = 0; k < n; ++k)
                System.out.printf(" %d", a[k]);
            System.out.println();
        }
        in.close();
        return;
    }
}
