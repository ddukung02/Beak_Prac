package Bronze_Deep1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Deep_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int King=0;
            int Queen=0;
            int Rook=0;
            int Bishop=0;
            int Knight=0;
            int Pawn=0;

            int[] chess = {King,Queen,Rook,Bishop,Knight,Pawn};

            // 배열에 입력 값 저장
            for (int i = 0; i < chess.length; i++) {
                chess[i] = Integer.parseInt(st.nextToken());
            }


            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
