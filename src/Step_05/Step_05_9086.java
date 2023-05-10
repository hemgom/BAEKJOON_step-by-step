// https://www.acmicpc.net/step/7

package Step_05;

import java.util.Scanner;

public class Step_05_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        if (count >= 1 && count <= 10) {
            for (int i = 1; i <= count; i++) {
                String word = sc.next();
                char[] letter = word.toCharArray();

                if (letter.length > 1) {
                    System.out.printf("%c%c\n", letter[0], letter[letter.length - 1]);
                } else if (letter.length == 1) {
                    System.out.printf("%c%c\n", letter[0], letter[0]);
                }
            }
        }
    }
}
