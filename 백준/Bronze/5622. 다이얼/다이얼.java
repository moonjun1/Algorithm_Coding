import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();
        scanner.close();

        int totalTime = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int time = getDialTime(c);
            totalTime += time;
        }

        System.out.println(totalTime);
    }

    // 각 알파벳에 대한 다이얼 시간을 반환하는 메서드
    public static int getDialTime(char c) {
        if (c >= 'A' && c <= 'C') return 3;
        else if (c >= 'D' && c <= 'F') return 4;
        else if (c >= 'G' && c <= 'I') return 5;
        else if (c >= 'J' && c <= 'L') return 6;
        else if (c >= 'M' && c <= 'O') return 7;
        else if (c >= 'P' && c <= 'S') return 8;
        else if (c >= 'T' && c <= 'V') return 9;
        else if (c >= 'W' && c <= 'Z') return 10;
        else return 0; // 예외 처리
    }
}