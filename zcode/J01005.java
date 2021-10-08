import java.io.*;
import java.util.*;
import java.math.*;

public class J01005 {
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
        while (t-- > 0) {
            int n = in.nextInt();
            int h = in.nextInt();
            for (int i = 1; i < n; ++i)
                System.out.printf("%.6f ", h * Math.sqrt( (double)i / n));
            System.out.println();
        }
        in.close();
        return;
    }
}
