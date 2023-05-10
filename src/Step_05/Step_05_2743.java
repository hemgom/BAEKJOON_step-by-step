// https://www.acmicpc.net/problem/2743

package Step_05;

import java.util.Scanner;

public class Step_05_2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char[] letter = word.toCharArray();

        System.out.printf("%d", letter.length);
    }
}
