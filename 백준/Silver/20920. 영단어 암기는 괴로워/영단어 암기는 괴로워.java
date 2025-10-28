import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 단어 개수
        int M = Integer.parseInt(st.nextToken()); // 외울 단어의 최소 길이

        Map<String, Integer> wordCount = new HashMap<>(); // 단어 빈도 저장

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) { // 길이가 M 이상인 단어만 저장
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // 단어를 리스트로 변환
        List<String> words = new ArrayList<>(wordCount.keySet());

        // 정렬
        words.sort((w1, w2) -> {
            int freq1 = wordCount.get(w1);
            int freq2 = wordCount.get(w2);

            if (freq1 != freq2) {
                return freq2 - freq1; // 빈도수 내림차순
            } else if (w1.length() != w2.length()) {
                return w2.length() - w1.length(); // 길이 내림차순
            } else {
                return w1.compareTo(w2); // 알파벳 사전순
            }
        });

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}