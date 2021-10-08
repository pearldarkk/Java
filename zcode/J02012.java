import java.io.*;
import java.util.*;

public class J02012 {
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

        for (int i = 0; i < n; ++i) {
            int piv = a[i];
            int j = i - 1;
            for (; j >= 0 && a[j] > piv; --j)
                a[j + 1] = a[j];
            a[j + 1] = piv;
            System.out.printf("Buoc %d:", i);
            for (int k = 0; k <= i; ++k)
                System.out.printf(" %d", a[k]);
            System.out.println();
        }
        in.close();
        return;
    }
}
