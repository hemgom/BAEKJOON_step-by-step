// https://www.acmicpc.net/problem/10952

package Step_03;

import java.io.*;
import java.util.StringTokenizer;

public class Step_03_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int s = 1;

        while (s == 1) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b==0) {
                s = 0;
            } else if (a > 0 && a < 10 && b > 0 && b < 10) {
                int result = a + b;
                bw.write(result + "\n");
            } else {
                System.out.println("입력값 범위 : 0 < n <10, 종료는 0 두번 입력");
            }
        }

        br.close();
        bw.close();

    }
}
