import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 체스 말의 올바른 개수 설정
        int[] correctPieces = {1, 1, 2, 2, 2, 8};

        // 입력받은 체스 말의 개수
        int[] currentPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            currentPieces[i] = scanner.nextInt();
        }
        scanner.close();

        // 필요한 말의 개수 계산 후 출력
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            result.append((correctPieces[i] - currentPieces[i]) + " ");
        }

        // 최종 결과 출력
        System.out.println(result.toString().trim());
    }

}