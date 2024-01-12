import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = "";
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            T = br.readLine();
            String[] myArray = T.split(" ");
            int iter = Integer.parseInt(myArray[0]);
            for (int j = 0; j < myArray[1].length(); j++) {
                for (int k= 0; k < iter; k++) {
                    bw.write(myArray[1].charAt(j));
                }
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}