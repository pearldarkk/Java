import java.io.*;
import java.util.*;
import java.math.*;

public class J03004 {
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
        in.nextLine();
        int len = 0;
        String s = "";
        while (t > 0) {
            --t;
            s = in.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            len = s.length();
            char[] sc = s.toCharArray();
            for (int i = 0; i < len; ++i) 
                if (i == 0 || sc[i - 1] == ' ')
                    sc[i] = Character.toUpperCase(sc[i]);
            s = String.valueOf(sc);
            System.out.println(s);
        }
        in.close();
        return;
    }
}
