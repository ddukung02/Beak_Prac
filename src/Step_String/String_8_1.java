package Step_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_8_1 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine().trim();

            if (input.isEmpty()) {
                System.out.println("Empty String");
            }else{
                StringTokenizer st = new StringTokenizer(input);
                System.out.println(st.countTokens());
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
