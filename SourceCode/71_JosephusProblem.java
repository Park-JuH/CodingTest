import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] T = br.readLine().split(" ");
        int n = Integer.parseInt(T[0]);
        int k = Integer.parseInt(T[1]);
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }
        
        bw.write("<");
        while(queue.size() > 1) {
            for(int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
            bw.write(queue.poll() + ", ");
        }
        bw.write(queue.poll() + ">");
        
        bw.flush();
        bw.close();
        br.close();
    }
}
