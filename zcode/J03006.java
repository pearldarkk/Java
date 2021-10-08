import java.io.*;
import java.util.*;
import java.math.*;

public class J03006 {
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

        String s = "";
        int t = in.nextInt();
        while (t > 0) {
            --t;
            s = in.next();
            boolean palind = true;
            int len = s.length();
            for (int i = 0; i < len/2; ++i) 
                if ((Character.getNumericValue(s.charAt(i)) & 1) == 1 || s.charAt(i) != s.charAt(len-i-1)) {
                    palind = false;
                    break;
                }
            if (palind)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        in.close();
        return;
    }
}
