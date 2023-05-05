// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

package Step_02;

import java.util.Scanner;

public class Step_02_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score < 90 && score >= 80) {
            System.out.println("B");
        } else if (score < 80 && score >= 70) {
            System.out.println("C");
        } else if (score < 70 && score >= 60) {
            System.out.println("D");
        } else if (score < 60 && score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("점수의 범위 : 0 <= x <= 100");
        }

    }
}
