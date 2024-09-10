package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array_6 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());


            int[] basket = new int[N+1];
            for (int i = 1; i < N+1; i++) {
               basket[i] = i;
            }
            int a,b,c;
            for (int i = 0; i < M; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st1.nextToken());
                b = Integer.parseInt(st1.nextToken());

                c =basket[a];
                basket[a] = basket[b];
                basket[b] = c;
            }
            for (int i = 1; i < N+1; i++) {
                bw.write(String.valueOf(basket[i])+" ");
            }

            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
