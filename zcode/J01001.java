import java.io.*;
import java.util.*;
import java.math.*;

public class J01001 {
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
        int a = in.nextInt();
        int b = in.nextInt();
        if (a <= 0 || b <= 0)
            System.out.println(0);
        else
            System.out.println((a + b) * 2 + " " + a * b);
        in.close();
        return;
    }
}
