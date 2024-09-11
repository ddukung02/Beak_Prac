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

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] arr = new int[N+1];
            for (int i = 1; i < N+1; i++) {
                arr[i] = i;
            }

            int A,B;
            int[] temp = new int[N+1];
            for (int i = 1; i < N+1; i++) {
                temp[i] = arr[i];
            }
            for (int i = 1; i < M+1; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                A=Integer.parseInt(st1.nextToken());
                B=Integer.parseInt(st1.nextToken());

                for (int j = A; j < B+1; j++) {
                    temp[j]=arr[B+A-j];
                }

                for (int j = 1; j < N+1; j++) {
                    arr[j]=temp[j];
                }
            }

            for (int i = 1; i < N+1; i++) {
                bw.write(arr[i]+" ");
            }
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
