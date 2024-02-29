import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 666;
        int count = 1;
        int sixCnt = 0;
        int temp = 0;
        int rest = 0;
        
        while(count != num) {
            result++;
            temp = result;
            sixCnt = 0;
            while(true) {
                rest = temp % 10;
                if (rest == 6)
                    sixCnt++;
                else
                    sixCnt = 0;
                if (sixCnt >= 3) {
                    count++;
                    break;
                }
                temp /= 10;
                if (temp == 0)
                    break;
            }
        }
        bw.write(""+result);
        bw.flush();
        bw.close();
        br.close();
    }
}