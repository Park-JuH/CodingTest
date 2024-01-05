import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        String T = br.readLine();
        
        for (int i = 0; i < T.length(); i++) {
            char temp = T.charAt(i);
            if ((int)temp >= 65 && (int)temp <= 90) {
                int result = (int)temp + 32;
                bw.write((char)result);
            }
            else if ((int)temp >= 97 && (int)temp <= 122) {
                int result = (int)temp - 32;
                bw.write((char)result);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}