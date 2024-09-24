package Bronze_Deep1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Deep_3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());

            for (int i = 1; i < 2*N+1; i+=2) {
                for (int j = 0; j < N-i/2-1; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }

                bw.newLine();
            }
            for (int i = 2*N-3; i > 0; i-=2) {
                for (int j = N-1; j >i/2 ; j--) {
                    bw.write(" ");
                }
                for (int j = i; j > 0; j--) {
                    bw.write("*");
                }
                bw.newLine();
            }


            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
