import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스의 개수 T 입력받기
        int T = Integer.parseInt(scanner.nextLine());

        // 모든 결과를 저장할 배열
        String[] results = new String[T];

        for (int i = 0; i < T; i++) {
            // 각 테스트 케이스의 입력 라인 읽기
            String[] input = scanner.nextLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];

            // 새 문자열 P 생성
            String P = "";

            // 각 문자를 R번 반복
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    P += c;
                }
            }

            // 결과 저장
            results[i] = P;
        }

        // 모든 결과 한 번에 출력
        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}