import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < num; i++) {
            words.add(br.readLine());
        }

        // 단어를 길이와 사전 순으로 정렬
        List<String> sortedWords = words.stream()
            .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
            .collect(Collectors.toList());

        for (String word : sortedWords) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}