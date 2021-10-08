import java.io.*;
import java.util.*;
import java.math.*;

public class J03027 {
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
        String s = in.next();
        String c = s.substring(0, 1);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < s.length(); ++i) {
                c = s.substring(i, i + 1);
                c += c;
                if (s.indexOf(c) >= 0) {
                    flag = true;
                    s = s.replace(c, "");
                    break;
                }
            }
        }
        System.out.print(s.length() > 0 ? s : "Empty String");
        in.close();
        return;
    }
}
