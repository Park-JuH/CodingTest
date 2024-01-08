import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        String T = br.readLine();
        double result = 0.0;
        if (T.charAt(0) == 'A') {
            result = 4.0;
        }
        else if (T.charAt(0) == 'B') {
            result = 3.0;
        }
        else if (T.charAt(0) == 'C') {
            result = 2.0;
        }
        else if (T.charAt(0) == 'D') {
            result = 1.0;
        }
        if (result != 0) {
            if (T.charAt(1) == '+') {
                result += 0.3;
            }
            else if (T.charAt(1) == '-'){
                result -= 0.3;
            }
        }
        bw.write(Double.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}