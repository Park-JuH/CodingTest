import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums = Integer.parseInt(br.readLine());
        int[] num = new int[nums];
        
        for (int i = 0; i < nums; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(num); // Arrays.sort를 사용하여 num 배열을 정렬합니다.
        
        for (int i = 0; i < nums; i++) {
            bw.write(num[i] + "\n"); // 정렬된 배열을 출력합니다.
        }
        bw.flush();
        bw.close();
        br.close();
    }
}