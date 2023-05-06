// https://www.acmicpc.net/problem/11022

package Step_03;

import java.io.*;
import java.util.StringTokenizer;

public class Step_03_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String s = br.readLine();
        int count = Integer.parseInt(s);

        for (int i = 1; i <= count; i++) {
            String num = br.readLine();
            st = new StringTokenizer(num);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result;

            if (a > 0 && a < 10) {
                if (b > 0 && b <10) {
                    result = a + b;
                    bw.write("Case #" + i + ": " + a + " + " + b + " = " + result + "\n");
                } else {
                    System.out.println("입력 값의 범위 : 0 < n < 10");
                    break;
                }
            } else {
                System.out.println("입력 값의 범위 : 0 < n < 10");
                break;
            }
        }
        br.close();
        bw.close();

    }
}
