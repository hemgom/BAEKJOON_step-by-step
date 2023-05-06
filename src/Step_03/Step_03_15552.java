// Scanner 대신 BufferedReader 를 사용하자!
// 처음 값은 테스트 카운트, 이후 입력 된 2개의 정수를 모두 더 한 값음 출력하는 프로그램을 만들자

package Step_03;

import java.io.*;
import java.util.StringTokenizer;

public class Step_03_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int count = Integer.parseInt(s);

        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b +"\n"); // 출력 아님 "버퍼에 적는다" 라고 이해
        }

        br.close(); // Reader 도 close 써주는게 좋다.
        bw.close(); // 버퍼 종료,  반드시

    }
}
