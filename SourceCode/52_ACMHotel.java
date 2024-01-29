import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int w = 1;
        int n = 0;
        int h = 0;
        for(int i = 0; i < num; i++) {
            w = 1;
            String[] myArray = br.readLine().split(" ");
            h = Integer.parseInt(myArray[0]);
            n = Integer.parseInt(myArray[2]);
            if (n % h == 0) {
                if (h == 1) {
                    w = n;
                }
                else {
                    w = n / h;
                }
            }
            else {
                w += n / h;
                h = n % h;
            }
            if (w < 10) {
                bw.write("" + h + "0" + w + "\n");
            }
            else {
                bw.write("" + h + w + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}