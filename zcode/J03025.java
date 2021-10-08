import java.io.*;
import java.util.*;
import java.math.*;

public class J03025 {
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
        int t = in.nextInt();
        boolean m = true, flag = false;
        while (t > 0) {
            --t;
            m = true;
            flag = false;
            String s = in.next();
            for (int i = 0; i < s.length() / 2; ++i)
                if (s.charAt(i) != s.charAt(s.length() - i - 1))
                    if (!flag)
                        flag = true;
                    else {
                        m = false;
                        break;
                    }
            if (m) {
                if (!flag && s.length() % 2 == 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            } else
                System.out.println("NO");

        }
        in.close();
        return;
    }
}
