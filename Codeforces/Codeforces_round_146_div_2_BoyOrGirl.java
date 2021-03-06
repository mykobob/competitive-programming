import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Created by WiNDWAY on 11/25/16.
 */

public class Codeforces_round_146_div_2_BoyOrGirl {

    public static void main(String[] args) {
        FScanner input = new FScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
        String line = input.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < line.length(); i++) {
            set.add(line.charAt(i));
        }
        out.println(set.size() % 2 == 1 ? "IGNORE HIM!" : "CHAT WITH HER!");
        out.close();
    }

    public static PrintWriter out;

    public static class FScanner {
        BufferedReader br;
        StringTokenizer st;

        public FScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}