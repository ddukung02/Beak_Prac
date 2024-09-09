package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array_5 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            int[] basket = new int[N];
            String[] s2 = new String[3];

            int i,j,k;
            for (int a = 0; a < M; a++) {
                s2 = br.readLine().split(" ");
                i = Integer.parseInt(s2[0]);
                j = Integer.parseInt(s2[1]);
                k = Integer.parseInt(s2[2]);

                for (int b = i-1; b <=j-1 ; b++) {
                    basket[b]=k;
                }
            }
            for (int a = 0; a < N; a++) {
                bw.write(String.valueOf(basket[a])+" ");
            }


            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
