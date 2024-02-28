import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // 입력 가능한 수의 범위 + 1 크기의 배열 선언
        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            // 입력받은 수에 해당하는 인덱스의 값을 1 증가
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            // 해당 수가 등장한 횟수만큼 반복하여 출력
            for (int j = 0; j < count[i]; j++) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}