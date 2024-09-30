package thisIsJava.prob;

import java.util.Scanner;

public class PROBC05 {
    static int[] scores;
    static double avgScore = 0.0;
    static int studentNum = 0;
    static int maxScore = 0;
    static Scanner sc = new Scanner(System.in);
    static int menuNum;

    public static void main(String[] args) {
        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택 > ");

            menuNum = sc.nextInt();

            if (menuNum == 1) {
                System.out.print("학생수 > ");
                studentNum = sc.nextInt();
                scores = new int[studentNum];

            } else if (menuNum == 2) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.printf("scores[%d] > ", i);
                    scores[i] = sc.nextInt();
                }

            } else if (menuNum == 3) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.printf("scores[%d] > %d ", i, scores[i]);
                    System.out.println();
                }

            } else if (menuNum == 4) {
                int sum = 0;
                for (int i = 0; i < studentNum; i++) {
                    maxScore = Math.max(scores[i], maxScore);
                    sum += scores[i];
                }

                avgScore = (double) sum / studentNum;

                System.out.println("최고 점수: " + maxScore);
                System.out.printf("평균 점수: %.2f", avgScore);
                System.out.println();

            } else if (menuNum == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
