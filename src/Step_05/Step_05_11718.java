// https://www.acmicpc.net/problem/11718

package Step_05;

import java.util.Scanner;

public class Step_05_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 참조변수 sc에 입력 값이 있는지 있는지 확인 : hasNext() - 있다면 ture 반환, 없다면 false 반환
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
