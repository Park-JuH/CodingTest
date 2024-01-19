import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] T = br.readLine().split(" ");
        int h = Integer.parseInt(T[0]);
        int m = Integer.parseInt(T[1]);
        
        if (m - 45 < 0) {
            if (h - 1 < 0) {
                h = 23;
            }
            else {
                h = h - 1;
            }
            m = 60 + m - 45;
        }
        else {
            m = m - 45;
        }
        bw.write(h + " " + m);
        bw.flush();
        bw.close();
        br.close();
    }
}