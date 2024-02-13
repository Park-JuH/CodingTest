import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] T = br.readLine().split(" ");
        int n = Integer.parseInt(T[0]);
        int m = Integer.parseInt(T[1]);
        int temp = 0;
        int max = 0;
        
        T = br.readLine().split(" ");
        int[] nums = new int[T.length];
        
        for (int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(T[i]);
        
        for (int i = 0; i < n-2 ; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    temp = nums[i] + nums[j] + nums[k];
                    if (max < temp && temp <= m)
                        max = temp;
                }
            }
        }

        bw.write(""+max);
        bw.flush();
        bw.close();
        br.close();
    }
}