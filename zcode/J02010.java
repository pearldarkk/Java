import java.io.*;
import java.util.*;

public class J02010 {
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
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j)
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            System.out.printf("Buoc %d:", i + 1);
            for (int k = 0; k < n; ++k)
                System.out.printf(" %d", a[k]);
            System.out.println();
        }
        in.close();
        return;
    }
}
