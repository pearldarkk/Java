import java.io.*;
import java.util.Scanner;

public class J01004 {
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
        int n = in.nextInt();
        int x;
        while (n > 0) {
            x = in.nextInt();
            if (prime(x))
                System.out.println("YES");
            else
                System.out.println("NO");
            --n;
        }
        in.close();
        return;
    }

    public static boolean prime(int x) {
        for (int i = 2; i * i <= x; ++i)
            if (x % i == 0)
                return false;
        return true;
    }
}
