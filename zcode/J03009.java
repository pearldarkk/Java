import java.io.*;
import java.util.*;
import java.math.*;

public class J03009 {
    public static void main(String args[]) {
        FileInputStream instream = null;
        // PrintStream outstream = null;
        try {
            instream = new FileInputStream("inp.txt");
            // outstream = new PrintStream(new FileOutputStream("out.txt"));
            System.setIn(instream);
            // System.setOut(outstream);
        } catch (Exception e) {
            System.err.println("Error Occurred.");
        }
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String s1 = "", s2 = "";
        while (t > 0) {
            --t;
            s1 = in.nextLine();
            s2 = in.nextLine();
            Set<String> ss1 = new TreeSet<String>(Arrays.asList(s1.split(" ")));
            List<String> l2 = Arrays.asList(s2.split(" "));

            for (String s : ss1)
                if (!l2.contains(s))
                    System.out.printf("%s ", s);
            System.out.printf("%n");
        }
        in.close();
        return;
    }
}
