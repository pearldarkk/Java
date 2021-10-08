import java.io.*;
import java.util.*;
import java.math.*;
// import javafx.util.*;
// https://stackoverflow.com/questions/32630354/the-import-javafx-cannot-be-resolved/34244725

public class J02104 {
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
        int n = 0;
        int m = 0;
        n = in.nextInt();
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                m = in.nextInt();
                if (m != 0 && i <= j) {
                    System.out.printf("(%d,%d)%n", i + 1, j + 1);
                }
            }
        in.close();
        return;
    }
}
