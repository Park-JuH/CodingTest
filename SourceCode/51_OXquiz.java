import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int iter = Integer.parseInt(br.readLine());
        String T = "";
        int count = 0;
        int result = 0;
        for (int i = 0; i < iter; i++) {
            T = br.readLine();
            count = 0;
            result = 0;
            for (int j = 0; j < T.length(); j++) {
                if (T.charAt(j) == 'O') {
                    count++;
                }
                else {
                    count = 0;
                }
                result += count;
            }
            bw.write(result+"\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}