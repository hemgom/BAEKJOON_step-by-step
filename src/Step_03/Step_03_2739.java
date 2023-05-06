// 1~9의 정수가 입력 되었을 때 입력된 단을 출력하는 구구단 프로그램을 작성하라.

package Step_03;

import java.util.Scanner;

public class Step_03_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan = sc.nextInt();

        if (dan >= 1 && dan <= 9) {
            googoodan(dan);
        } else {
            System.out.println("입력 범위 : 1<= dan <= 9");
        }

    }

    static void googoodan(int a) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n", a, i, a * i);
        }
    }
}
