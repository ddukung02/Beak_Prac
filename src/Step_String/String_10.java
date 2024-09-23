package Step_String;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            char letter;
            char letter2='A';
            int number= 2;
            int count =0;
            for (int i = 0; i < S.length(); i++) {
                letter = S.charAt(i);
                if(letter=='Z'||letter=='Y'){
                    number=9;
                    count+=(number+1);
                    continue;
                }
                letter2='A';
                outerLoop:
                for (int j = 2; j < 10; j++) {
                    if (j==7||j==9){
                        for (int k=0;k<4;k++){
                            if (letter==letter2+k){
                                number=j;

                                letter2='A';
                                break outerLoop;
                            }
                        }
                        letter2 += 4;
                    }else {
                        for (int k = 0; k < 3; k++) {
                            if (letter == letter2 + k) {
                                number = j;

                                letter2 = 'A';
                                break outerLoop;
                            }
                        }
                        letter2 += 3;
                    }
                }
                count+=(number+1);

            }
            bw.write(count+"\n");

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
