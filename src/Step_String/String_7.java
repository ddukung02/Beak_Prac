package Step_String;

import java.io.*;
import java.util.StringTokenizer;

public class String_7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());  // N개의 입력
            int[] R = new int[N];  // 반복 횟수 저장 배열
            String[] S = new String[N];  // 문자열 저장 배열

            // 입력 받기
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                R[i] = Integer.parseInt(st.nextToken());  // 반복 횟수
                S[i] = st.nextToken();  // 문자열
            }

            // 각 문자열에 대해 처리
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < S[i].length(); j++) {  // 각 문자열의 각 문자를
                    for (int k = 0; k < R[i]; k++) {  // R[i]번 만큼 반복
                        bw.write(S[i].charAt(j));  // 해당 문자를 출력
                    }
                }
                bw.write("\n");  // 각 문자열 출력 후 줄바꿈
            }

            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
