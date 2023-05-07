// https://www.acmicpc.net/problem/10951
// 뭔 문제가 설명도 없고 어거지로 냄;;

package Step_03;

import java.util.Scanner;

public class Step_03_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        // Scanner클래스의 hasNext<타입>() 메서드는 입력 받은 값이 타입에 부합하면 true를 부합하지 않는다면 false를 반환한다.
        // while문은 조건식에 부합하지 않을 경우(false) 종료 됨 >> 정수가 입력되지 않으면 while문이 멈춤
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > 0 && a < 10 && b > 0 && b <10) {
                System.out.println(a+b);
            } else {
                System.out.println("입력값 범위 : 0 < n < 10 의 정수");
                break;
            }
        }

    }
}
