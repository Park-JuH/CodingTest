import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] T = br.readLine().split(" ");
        int[] nums = new int[3];
        
        while(T[0].charAt(0) != '0') {
            for (int i = 0; i < 3; i++)
                nums[i] = Integer.parseInt(T[i]);
            
            Arrays.sort(nums);
            
            if (nums[2]*nums[2] == nums[0]*nums[0] + nums[1]*nums[1])
                bw.write("right\n");
            else
                bw.write("wrong\n");
            T = br.readLine().split(" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}