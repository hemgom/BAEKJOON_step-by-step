// https://www.acmicpc.net/problem/5622

package Step_05;

import java.util.Scanner;

public class Step_05_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        char[] letter = text.toCharArray();
        int minTime = 0;

        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 'A' || letter[i] == 'B' || letter[i] == 'C') {
                minTime += 3;
            } else if (letter[i] == 'D' || letter[i] == 'E' || letter[i] == 'F') {
                minTime += 4;
            } else if (letter[i] == 'G' || letter[i] == 'H' || letter[i] == 'I') {
                minTime += 5;
            } else if (letter[i] == 'J' || letter[i] == 'K' || letter[i] == 'L') {
                minTime += 6;
            } else if (letter[i] == 'M' || letter[i] == 'N' || letter[i] == 'O') {
                minTime += 7;
            } else if (letter[i] == 'P' || letter[i] == 'Q' || letter[i] == 'R' || letter[i] == 'S') {
                minTime += 8;
            } else if (letter[i] == 'T' || letter[i] == 'U' || letter[i] == 'V') {
                minTime += 9;
            } else if (letter[i] == 'W' || letter[i] == 'X' || letter[i] == 'Y' || letter[i] == 'Z') {
                minTime += 10;
            }
        }
        System.out.println(minTime);
    }
}
