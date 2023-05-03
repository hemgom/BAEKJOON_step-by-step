// a(세 자리 수) × b(세 자리 수) 를 계산 할 때
// a×b의 1의자리 수, a×b의 10의자리 수, a×b의 100의자리 수 에 해당 하는 값을 순차적으로 구하고 최종 결과를 출력하라

package Step_01;

import java.util.Scanner;

public class Step_01_2588 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int num2 = sc1.nextInt();

        //두 번째 입력 된 값의 1의 자리, 10의 자리, 100의 자리 값을 구해준다.
        int r1 = num2%10;
        int r2 = (num2/10)%10;
        int r3 = num2/100;

        System.out.printf("%d%n", num1*r1);
        System.out.printf("%d%n", num1*r2);
        System.out.printf("%d%n", num1*r3);
        System.out.printf("%d%n", num1*num2);

    }
}
