import java.io.*;
import java.util.Scanner;

public class J01006 {
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
        int n = in.nextInt();
        while (n > 0) {
            int x = in.nextInt();
            System.out.println(fib(x));
            --n;
        }
        in.close();
        return;
    }

    public static long fib(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        if (x == 2)
            return 1;
            
        long f1 = 1, f2 = 1, f3 = 0;
        for (int i = 2; i < x; ++i) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
