import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 5; i <= num; i *= 5) {
            count += num / i;
        }

        bw.write("" + count);
        bw.flush();
        bw.close();
        br.close();
    }
}