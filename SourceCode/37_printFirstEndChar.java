import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String T = "";
        while((T = br.readLine()) != null) {
            bw.write(T.charAt(0));
            bw.write(T.charAt(T.length() - 1));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}