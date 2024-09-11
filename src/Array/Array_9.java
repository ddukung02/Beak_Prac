package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array_9 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            boolean[] arr = new boolean[31];

            for (int i = 1; i < 29; i++) {
                int N = Integer.parseInt(br.readLine());
                arr[N]=true;
            }

            for (int i = 1; i < 31; i++) {
                if (arr[i] == false) {
                    bw.write(i + "\n");
                }
            }



            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
