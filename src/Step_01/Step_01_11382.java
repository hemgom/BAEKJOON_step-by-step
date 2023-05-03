// 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

package Step_01;

import java.util.Scanner;

public class Step_01_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 조건이 21억이 넘을 수 있으므로 long을 사용한다.
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long sum1 = a+b;
        long sum2 = sum1+c;

        System.out.printf("%d%n", sum2);

    }
}
