package Bronze_Deep1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Deep_7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = br.readLine();
            }

            int groupCount=0;
            for (int i = 0; i < N; i++) {

                char[] array = S[i].toCharArray();
                char[] array2= new char[array.length];
                Arrays.fill(array2,' ');
                int count=0;
                for (int j = 1; j < array.length; j++) {
                    if (array[j-1]==array[j]) {
                        continue;
                    }
                    array2[j]=array[j];
                }

                for (int j=0; j<array2.length; j++) {
                    if (array2[j]==' ') {
                        continue;
                    }
                    for (int k=j+1; k<array2.length; k++) {
                        if(array2[k]==' ') {
                            continue;
                        }
                        if (array2[j]==array2[k]) {
                            count++;
                        }
                    }
                }

                if (count==0) {
                    groupCount++;
                }
            }
            System.out.println(groupCount);

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
