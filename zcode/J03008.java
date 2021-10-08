import java.io.*;
import java.util.*;
import java.math.*;

public class J03008 {
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
            boolean flag = true;
            for (int i = 0; i < len; ++i) {
                if (s.charAt(i) != s.charAt(len - i - 1) || !p(s.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
        return;
    }

    static boolean p(char c) {
        switch (c) {
            case '2':
            case '3':
            case '5':
            case '7':
                return true;
            default: 
                return false;
        }
    }
}
