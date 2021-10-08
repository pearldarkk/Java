import java.io.*;
import java.util.*;
import java.math.*;

public class J01003 {
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
        float a = in.nextFloat();
        float b = in.nextFloat();
        if ((a == 0) && (b == 0)) 
            System.out.println("VSN");
        if ((a == 0) && (b != 0)) 
            System.out.println("VN");
        if ((a != 0) && (b != 0)) {
            float d = -b / a;
            System.out.printf("%.2f", d);
        }
        in.close();
        return;
    }
}
