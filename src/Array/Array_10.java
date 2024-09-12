package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.StringTokenizer;

public class Array_10 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());
            int[] subject = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M=0;
            double updatedScore=0;
            for (int i = 0; i < N; i++) {
                subject[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < N; i++) {
                    M = Math.max(M, subject[i]);
            }

            OptionalDouble average = Arrays.stream(subject).average();

                updatedScore =  (average.getAsDouble())*100/M;

            bw.write(updatedScore + "\n");

            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
