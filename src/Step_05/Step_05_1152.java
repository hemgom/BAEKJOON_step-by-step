// https://www.acmicpc.net/problem/1152

package Step_05;

import java.util.Scanner;

public class Step_05_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        char[] letter = sentence.toCharArray();
        int[] nums = new int[letter.length];
        int num = 0;

        for (int i = 0; i < letter.length; i++) {
            if (letter[i] != ' ') {
                if (i > 0) {
                    if (letter[i - 1] == ' ') {
                        num += 1;
                    }
                } if (i == 0) {
                    num +=1;
                }
                nums[i] = num;
            }
        }

        System.out.println(num);
    }
}
