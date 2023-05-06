// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

package Step_03;

import java.util.Scanner;

public class Step_03_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = sc.nextInt();
        int[] sum = new int[testNum];

        for (int i = 0; i < sum.length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > 0 && a < 10) {
                if (b > 0 && b <10) {
                    sum[i] = a + b;
                } else {
                    System.out.println("입력 값 범위 : 0 < n < 10");
                }
            } else {
                System.out.println("입력 값 범위 : 0 < n < 10");
            }
        }

        for (int j = 0; j < sum.length; j++) {
            System.out.println(sum[j]);
        }

    }
}
