// https://www.acmicpc.net/problem/3003

package Step_06;

import java.util.Scanner;

public class Step_06_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] fullChess = {1, 1, 2, 2, 2, 8};
        int[] hasChess = new int[6];
        int[] needChess = new int[6];

        for (int i = 0; i < 6; i++) {
            hasChess[i] = sc.nextInt();
            if (hasChess[i] > fullChess[i] || hasChess[i] < fullChess[i]) {
                needChess[i] = fullChess[i] - hasChess[i];
            } else if (hasChess[i] == fullChess[i]) {
                needChess[i] = 0;
            }
        }

        for (int j = 0; j < 6; j++) {
            System.out.printf("%d ", needChess[j]);
        }
    }
}
