import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long r = 31;
        long rPow = 1;
        long m = 1234567891;
        
        long numSize = Long.parseLong(br.readLine());
        String T = br.readLine();
        long sum = 0;
        for (int i = 0; i < T.length(); i++) {
            sum += ((long)T.charAt(i) - 96) * rPow % m;
            rPow = rPow * r % m;
        }
        long result = sum % m;
        bw.write(""+result);
        bw.flush();
        bw.close();
        br.close();
    }
}