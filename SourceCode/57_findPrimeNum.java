import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int result = 0;
        int temp = 0;
        for (int i = 0; i < count; i++) {
            temp = Integer.parseInt(nums[i]);
            for (int j = 2; j <= temp; j++) {
                if (temp % j == 0) {
                    if (j == temp) {
                        result++;
                    }
                    else break;
                }
            }
        }
        bw.write(""+result);
        bw.flush();
        bw.close();
        br.close();
    }
}