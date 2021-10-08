import java.io.*;
import java.util.*;
import java.math.*;

public class J02008 {
    static HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
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

        while (t > 0) {
            --t;
            int n = in.nextInt();
            pDiv(n);
            long r = 1;
            for (Map.Entry<Integer, Integer> x : m.entrySet()) 
                for (int i = 0; i < x.getValue(); ++i)
                    r *= x.getKey();
            System.out.println(r);
            m.clear();
        }
        in.close();
        return;
    }
    static void pDiv(int n) {
        m.put(2, 0);
        for (int i = 2; i <= n; ++i) {
            int x = i;
            int cnt = 0;
            while ((x & 1) == 0) {
                ++cnt;
                x >>= 1;
            }
            if (m.get(2) < cnt)
                m.put(2, cnt);
            for (int j = 3; j * j <= x; j += 2)
                if (x % j == 0) {
                    cnt = 0;
                    while (x % j == 0) {
                        x /= j;
                        ++cnt;
                    }
                    if (m.containsKey(j))
                        if (m.get(j) >= cnt)
                            continue;
                        else m.put(j, cnt);
                }
            if (x != 1)
                if (m.containsKey(x))
                    continue;
                else m.put(x, 1);
        }
    }
}
