import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수 입력

        for (int i = 0; i < T; i++) {
            int k = scanner.nextInt(); // 층 입력
            int n = scanner.nextInt(); // 호 입력
            System.out.println(peopleInApartment(k, n));
        }

        scanner.close();
    }

    public static int peopleInApartment(int k, int n) {
        if (k == 0) { // 0층일 경우
            return n;
        } else if (n == 1) { // 1호일 경우
            return 1;
        } else {
            return peopleInApartment(k - 1, n) + peopleInApartment(k, n - 1);
        }
    }
}
