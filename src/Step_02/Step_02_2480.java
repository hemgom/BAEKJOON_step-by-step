// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
// 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
// 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

package Step_02;

import java.util.Scanner;

public class Step_02_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result;

        if (num1 > 0 && num1 < 7) {
            if (num2 > 0 && num2 < 7) {
                if (num3 > 0 && num3 < 7) {
                    if (num1 == num2 && num2 == num3) {
                        result = 10000 + num1 * 1000;
                    } else if (num1 == num2 || num2 == num3 || num1 == num3) {
                        if (num1 == num2) {
                            result = 1000 + num1 * 100;
                        } else if (num2 == num3) {
                            result = 1000 + num2 * 100;
                        } else {
                            result = 1000 + num3 * 100;
                        }
                    } else {
                        if (num1 - num2 > 0) {
                            if (num1 - num3 > 0) {
                                result = num1 * 100;
                            } else {
                                result = num3 * 100;
                            }
                        } else {
                            if (num2 - num3 > 0) {
                                result = num2 * 100;
                            } else {
                                result = num3 * 100;
                            }
                        }
                    }
                    System.out.println(result);
                } else {
                    System.out.println("주사위 값의 범위는 1~6");
                }
            } else {
                System.out.println("주사위 값의 범위는 1~6");
            }
        } else {
            System.out.println("주사위 값의 범위는 1~6");
        }

    }
}
