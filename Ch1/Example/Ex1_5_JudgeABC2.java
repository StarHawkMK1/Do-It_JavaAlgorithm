package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 입력한 값에 따라 값 출력하기 (if-else if문을 활용한 조건 판단과 분기)

public class Ex1_5_JudgeABC2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("A");
        } else if (n == 2) {
            System.out.println("B");
        } else if (n == 3) {
            System.out.println("C");
        } else;                         // <예제1-4 & 1-5의 차이>
    }                                   // 1-4는 n값이 1 또는 2가 아니라면 전부 "C"를 출력.
}                                       // 1-5는 n값이 1, 2, 3에 해당하지 않으면 어떠한 값도 출력하지 않음.
