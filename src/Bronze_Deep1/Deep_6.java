package Bronze_Deep1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Deep_6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String word = br.readLine();

            // 크로아티아 알파벳을 모두 처리할 수 있도록 배열로 만듦
            String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            // 주어진 문자열에서 크로아티아 알파벳을 모두 처리
            for (String croatian : croatianAlphabets) {
                word = word.replace(croatian, "!");
            }

            // 최종적으로 남은 문자열의 길이를 출력 (크로아티아 알파벳을 하나로 간주)
            System.out.println(word.length());

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
