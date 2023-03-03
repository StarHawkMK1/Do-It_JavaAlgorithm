package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 반복과정에서 조건 판단하기3
// 예제 1-14 vs 1-15 비교하기


public class Ex1_15_PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되, w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값: ");
            w = sc.nextInt();
        } while (n <= 0);


        for (int i = 0; i < n / w; i++) {       // *를 w개 출력하면서 n/w번 실행
            System.out.println("*".repeat(w));  // n값이 w값의 배수인 경우, 이 단계에서 출력을 완료.
        }                                       // "*".repeat9(w)는 *를 w번 반복한 문자열을 생성하여 반환.
                                                // 메서드 repeat()는 String클래스에 있는 인스턴스 메서드.

        int rest = n % w;                          // n값을 w값으로 나눈 나머지를 구하여 변수 rest에 저장.
        if (rest != 0) {                           // *를 rest개 출력하고, 줄 바꿈을 실행. 즉, n값이 w값의 배수가 아닌 경우, 남아 있는 마지막 줄 바꿈을 실행.
            System.out.println("*".repeat(rest));  // (n값이 w값의 배수이면, rest는 0이므로 if문 실행 X.
        }
    }
}

