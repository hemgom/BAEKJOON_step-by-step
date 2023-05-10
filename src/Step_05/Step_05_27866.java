// https://www.acmicpc.net/problem/27866

package Step_05;

import java.util.Scanner;

public class Step_05_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char[] letter = word.toCharArray();

        if (letter.length <= 1000) {
            int num = sc.nextInt();
            if (num >= 1 && num <= letter.length) {
                System.out.printf("%s", letter[num-1]);
            }
        }
    }
}
