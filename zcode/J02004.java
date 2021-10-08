import java.io.*;
import java.util.*;

public class J02004 {
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
        while (t > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            boolean palind = true;
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt(); 
                if (i > n/2)
                    if (a[i] != a[n-i-1]) {
                        palind = false;
                        break;
                    }
            }
            if (palind)
                System.out.println("YES");
            else 
                System.out.println("NO");
            --t;
        }
        in.close();
        return;
    }
}
