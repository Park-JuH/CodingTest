import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = "";
        int num = 0;
        String result = "yes";
        while((T = br.readLine()) != null) {
            if (T.charAt(0) == '0') break;
            num = T.length();
            result = "yes";
            if (num > 1) {
                for (int i = 0; i < num / 2; i++) {
                    if (T.charAt(i) != T.charAt(num - i - 1)) {
                        result = "no";
                        break;
                    }
                }
            }
            bw.write(result+"\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}