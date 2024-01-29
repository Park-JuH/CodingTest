import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alphabet = new int[26];
        String T = br.readLine();
        char a = 'a';
        HashMap<Character, Integer> alphabetCounts = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabetCounts.put(a, -1);
            a++;
        }
        for (int i = 0; i < T.length(); i++) {
            char currentChar = T.charAt(i);
            if (alphabetCounts.containsKey(currentChar) && alphabetCounts.get(currentChar) == -1) {
                alphabetCounts.put(currentChar, i);
            }
        }
        for (int i = 0; i < 26; i++) {
            bw.write(alphabetCounts.get((char)('a' + i)) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}