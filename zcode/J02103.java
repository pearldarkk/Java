import java.io.*;
import java.util.*;
import java.math.*;

public class J02103 {
    public static void main(String args[]) {
    //     FileInputStream instream = null;
    //     // PrintStream outstream = null;
    //     try {
    //         instream = new FileInputStream("inp.txt");
    //         // outstream = new PrintStream(new FileOutputStream("out.txt"));
    //         System.setIn(instream);
    //         // System.setOut(outstream);
    //     } catch (Exception e) {
    //         System.err.println("Error Occurred.");
    //     }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = 0, m = 0;
        int[][] a = new int[1005][1005];
        int[][] b = new int[1005][1005];
        int[][] c = new int[1005][1005];
        for (int p = 1; p <= t; ++p) {
            System.out.printf("Test %d:%n", p);
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    a[i][j] = in.nextInt();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    b[j][i] = a[i][j];

            for (int[] r : c)
                Arrays.fill(r, 0);

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    for (int l = 0; l < m; l++)
                        c[i][j] += a[i][l] * b[l][j];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.printf("%d ", c[i][j]);
                System.out.printf("%n");
            }
        }
        in.close();
        return;
    }
}
