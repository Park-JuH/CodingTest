import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] T = br.readLine().split(" ");
        int max = Integer.parseInt(T[0]);
        int min = Integer.parseInt(T[1]);
        int maxDiv = 1;
        int minMul = 1;
        if (max < min) {
            minMul = max;
            max = min;
            min = minMul;
        }
        else
            minMul = min;
        for (int i = 1; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {
                maxDiv = i;
            }
        }
        for (int i = minMul; i <= min*max; i++) {
            if (i % min == 0 && i % max == 0) {
                minMul = i;
                break;
            }
        }
        bw.write(""+maxDiv + "\n" + minMul);
        bw.flush();
        bw.close();
        br.close();
    }
}