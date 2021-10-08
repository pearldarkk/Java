import java.io.*;
import java.util.*;
import java.math.*;

public class J03010 {
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
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        in.nextLine();
        int val = 0;
        while (t > 0) {
            --t;
            s = in.nextLine();
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] ss = s.split(" ");
            s = ss[ss.length - 1];
            for (int i = 0; i < ss.length - 1; ++i)
                s += ss[i].charAt(0);
            if (!m.containsKey(s))
                val = 1;
            else
                val = m.get(s) + 1;
            m.put(s, val);
            if (val > 1)
                s += Integer.toString(val);
            System.out.println(s + "@ptit.edu.vn");
        }
        in.close();
        return;
    }
}
