import java.io.*;
import java.util.*;
import java.math.*;

public class J03007 {
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
        String s = "";
        int sum = 0;
        while (t > 0) {
            --t;
            s = in.next();
            int len = s.length();
            boolean flag = s.charAt(0) == '8' && s.charAt(len - 1) == '8';
            sum = 0;
            if (flag) {
                for (int i = 0; i < len; ++i) {
                    sum += Character.getNumericValue(s.charAt(i));
                    if (s.charAt(i) != s.charAt(len - i - 1)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                if (sum % 10 != 0)
                    flag = false;
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
        return;
    }
}
