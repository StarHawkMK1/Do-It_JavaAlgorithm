package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 반복과정에서 조건 판단하기3
// 예제 1-14 vs 1-15 비교하기

public class Ex1_14_PrintStars1 {
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

        for (int i = 0; i < n; i++) {       // 변수 i값을 1씩 증가시키면서 *를 출력. 아래 두 곳에서 줄 바꿈 실행.
            System.out.print("*");
            if (i % w == w - 1) {           // for문에서 변수 i값을 w값으로 나눈 나머지가 w-1일 때,
                System.out.println();       // 줄 바꿈 실행.
            }
        }
        if (n % w != 0) {                   // n값이 w값의 배수가 아닐 때,
            System.out.println();           // 줄 바꿈 실행.
        }                            // for문 반복을 n번 실행, if문 판단은 n+1번 실행
    }                                // !!! for문을 반복할 때마다 if문을 실행하므로 비효율적 -> 예제1-15 개선 코드
}
