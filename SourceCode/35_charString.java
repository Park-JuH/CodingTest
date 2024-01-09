import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        String T = br.readLine();
        int num = Integer.parseInt(br.readLine());
        bw.write(T.charAt(num - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}