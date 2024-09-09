package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array_4 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] arr=new int[9];
            arr[0]=0;
            int num = arr[0];
            int count=0;
            for (int i=0;i<9;i++){
                arr[i] = Integer.parseInt(br.readLine());
                if (arr[i]>num){
                    num=arr[i];
                    count=i+1;
                }
            }
            bw.write(num+"\n"+count);
            // 출력 버퍼를 모두 출력하고 리소스 해제
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
