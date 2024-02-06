import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        long result = 0;
        long sum = 0;
        long temp = 0;
        long start = Math.max(1, num - 9 * Long.toString(num).length());
        for (long i = start; i < num; i++) {
            temp = i;
            sum = i;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == num) {
                result = i;
                break;
            }
        }
        bw.write(""+result);
        bw.flush();
        bw.close();
        br.close();
	}
}