import java.io.*;
import java.util.*;
import java.math.*;

public class J02105 {
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
        int n = 0;
        int m = 0;
        n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            System.out.printf("List(%d) =", i + 1);
            for (int j = 0; j < n; ++j) {
                m = in.nextInt();
                if (m != 0) {
                    System.out.printf(" %d", j + 1);
                }
            }
            System.out.println();
        }
        in.close();
        return;
    }
}
