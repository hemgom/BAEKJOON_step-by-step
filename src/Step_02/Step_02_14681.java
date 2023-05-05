// 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
// 예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
// 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

package Step_02;

import java.util.Scanner;

public class Step_02_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && x <= 1000) {
            if (y > 0 && y <= 1000) {
                System.out.println("1");
            } else if (y < 0 && y >= -1000) {
                System.out.println("4");
            } else {
                System.out.println("y값의 범위 : -1000 <= y <= 1000 그리고 y != 0");
            }
        } else if (x < 0 && x >= -1000) {
            if (y > 0 && y <= 1000) {
                System.out.println("2");
            } else if (y < 0 && y >= -1000) {
                System.out.println("3");
            } else {
                System.out.println("y값의 범위 : -1000 <= y <= 1000 그리고 y != 0");
            }
        } else {
            System.out.println("x값의 범위 : -1000 <= x <= 1000 그리고 x != 0");
        }

    }
}
