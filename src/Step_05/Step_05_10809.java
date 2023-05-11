// https://www.acmicpc.net/problem/10809

package Step_05;

import java.util.Scanner;

public class Step_05_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] letter = word.toCharArray();
        // 소문자 알파벳 개수 = 26개
        int[] alphabet = new int[26];

        // alphabet 의 각 배열에 저장된 값을 -1로 초기화
        for (int k = 0; k < alphabet.length; k++) {
            alphabet[k] = -1;
        }

        method10809(letter, alphabet);

        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("%d ", alphabet[i]);
        }
    }
    static int[] method10809(char[] a, int[] b) {
        // 알파벳 아스키코드 a = 97, z = 122
        for (int j = 0; j < a.length; j++) {
            int ascii = a[j] - 97;
            for (int i = 0; i < b.length; i++) {
                if (ascii == i) {
                    if (b[i] == -1) {
                        b[i] = j;
                    }
                }
            }
        }
        return b;
    }
}
