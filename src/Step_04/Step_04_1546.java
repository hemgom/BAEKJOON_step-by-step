// https://www.acmicpc.net/problem/1546

package Step_04;

import java.util.Scanner;

public class Step_04_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sNum = sc.nextInt();
        int[] sScore = new int[sNum];
        int maxScore = 0;

        if (sNum > 0 && sNum <= 1000) {
            for (int i = 0; i < sNum; i++) {
                int score = sc.nextInt();
                if (score >= 0 && score <= 100) {
                    sScore[i] = score;
                }
            }
            maxScore = method1546_1(sScore);
        }

        System.out.println(method1546_2(sScore, maxScore));
    }

    static float method1546_2(int[] a, int b) {
        float newScore;
        float newScoreSum = 0.0f;
        float result;

        for (int i = 0; i < a.length; i++) {
            newScore = (float)a[i] / (float)b * 100;
            newScoreSum += newScore;
        }

        result = newScoreSum / a.length;
        return result;
    }
    static int method1546_1(int[] a) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (result <= a[i]) {
                result = a[i];
            }
        }

        return result;
    }
}
