import java.io.*;
import java.util.*;
import java.math.*;

public class J01007 {

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
        Vector<Long> v = new Vector<Long>();
        v.add(0L);
        v.add(1L);
        for (int i = 2; i < 93; ++i)
            v.add(v.get(i - 2) + v.get(i - 1));

        int t = in.nextInt();
        long n = 0;
        while (t > 0) {
            --t;
            n = in.nextLong();
            if (v.contains(n))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        in.close();
        return;
    }
}
