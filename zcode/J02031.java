import java.io.*;
import java.util.*;
import java.math.*;

public class J02031 {
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
        ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>>();
        int imin = -1;
        for (int i = 0; i < n - 1; ++i) {
            imin = i;
            for (int j = i + 1; j < n; ++j)
                if (a[imin] > a[j])
                    imin = j;
            int tmp = a[i];
            a[i] = a[imin];
            a[imin] = tmp;
            ArrayList<Integer> vtmp = new ArrayList<Integer>(n);
            for (int k = 0; k < n; ++k)
                vtmp.add(a[k]);
            v.add(vtmp);
        }

        for (int i = v.size() - 1; i >= 0; --i) {
            System.out.printf("Buoc %d:", i + 1);
            for (int j = 0; j < v.get(i).size(); ++j)
                System.out.printf(" %d", v.get(i).get(j));
            System.out.println();
        }

        in.close();
        return;
    }
}
