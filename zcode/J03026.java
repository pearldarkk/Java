import java.io.*;
import java.util.*;
import java.math.*;

public class J03026 {
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
            String a = in.next();
            String b = in.next();
            if (a.length() < b.length()) {
                String tmp = a;
                a = b;
                b = tmp;
            }
            String c = "";
            int r = 0;
            for (int i = 0; i < a.length(); ++i)
                for (int j = i + r + 1; j <= a.length(); ++j) {
                    c = a.substring(i, j);
                    if (b.indexOf(c) < 0)
                        r = c.length() > r ? c.length() : r;
                }
            System.out.println(r > 0 ? r : -1);
        }
        in.close();
        return;
    }
}
