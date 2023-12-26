import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp;
        boolean[] isPresent = new boolean[31];
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        
        for (int i = 0; i < 28; i++) {
            isPresent[Integer.parseInt(br.readLine())] = true;
        }
        
        for (int i = 1; i <= 30; i++) {
            if (isPresent[i] != true) {
                arrayList.add(i);
            }
        }
        int a = arrayList.get(0);
        int b = arrayList.get(1);
        if (a > b) {
            System.out.println(b);
            System.out.println(a);
        }
        else {
            System.out.println(a);
            System.out.println(b);
        }
        bw.close();
        br.close();
    }
}