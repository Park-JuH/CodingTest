import java.io.*;
import java.util.*;

class User implements Comparable<User> {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(User other) {
        return this.age - other.age; // 나이가 증가하는 순으로 정렬
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        List<User> users = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            users.add(new User(age, name));
        }

        Collections.sort(users); // 사용자 정의 클래스의 compareTo() 메소드를 기반으로 정렬

        for (User user : users) {
            bw.write(user.age + " " + user.name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}