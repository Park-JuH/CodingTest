import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] T = br.readLine().split(" ");
        
        long[] abv = new long[T.length];
        for (int i = 0; i < abv.length; i++) {
            abv[i] = Long.parseLong(T[i]);
        }
        long days = (abv[2] - abv[1] - 1) / (abv[0] - abv[1]) + 1;;
        bw.write("" + days);
        bw.flush();
        bw.close();
        br.close();
    }
}