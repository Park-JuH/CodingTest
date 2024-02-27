import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] T = br.readLine().split(" ");
        long n = Long.parseLong(T[0]);
        long k = Long.parseLong(T[1]);
        long sum = 1;
        if (k == n || n == 1)
            sum = 1;
        else {
            for (long i = 1; i <= k; i++) {
                sum *= (n - i + 1);
                sum /= i;
            }
        }
        bw.write(""+sum);
        bw.flush();
        bw.close();
        br.close();
    }
}