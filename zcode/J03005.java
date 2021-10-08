import java.io.*;
import java.util.*;
import java.math.*;

public class J03005 {
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
        in.nextLine();
        String s = "";
        while (t > 0) {
            --t;
            s = in.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] ss = s.split(" ");
            s = "";
            for (int i = 1; i < ss.length; ++i) {
                s += String.valueOf(ss[i].charAt(0)).toUpperCase() + ss[i].substring(1);
                if (i < ss.length - 1)
                    s += " ";
            }
            s += ", " + String.valueOf(ss[0].toUpperCase());
            System.out.println(s);
        }
        in.close();
        return;
    }
}
