import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String T = br.readLine().toUpperCase();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : T.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        char maxWord = '?';
        int maxCount = 0;
        for (char c : charCounts.keySet()) {
            if (charCounts.get(c) > maxCount) {
                maxCount = charCounts.get(c);
                maxWord = c;
            } else if (charCounts.get(c) == maxCount) {
                maxWord = '?';
            }
        }

        bw.write(maxWord);
        bw.flush();
        bw.close();
        br.close();
    }
}
