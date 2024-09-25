package Bronze_Deep1;
import java.io.*;

public class Deep_5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().toUpperCase(); // 대소문자 구분 없으므로 대문자로 통일

        int[] count = new int[26]; // 알파벳의 빈도를 저장할 배열

        // 각 알파벳의 빈도를 카운트
        for (int i = 0; i < S.length(); i++) {
            count[S.charAt(i) - 'A']++; // 'A'를 기준으로 인덱스 설정
        }

        // 가장 많이 사용된 알파벳을 찾는 과정
        int maxCount = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = (char) (i + 'A'); // 인덱스를 다시 문자로 변환
            } else if (count[i] == maxCount) {
                result = '?'; // 동일한 빈도의 문자가 있으면 '?'로 설정
            }
        }

        System.out.println(result);
    }
}
