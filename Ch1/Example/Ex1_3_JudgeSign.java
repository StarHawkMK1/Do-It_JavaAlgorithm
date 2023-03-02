package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 입력한 정숫값의 부호(양수, 음수, 0) 판단하기 (if-else if문을 활용한 조건 판단과 분기)

public class Ex1_3_JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("이 수는 양수입니다.");
        } else if (n < 0) {
            System.out.println("이 수는 음수입니다.");
        } else {
            System.out.println("이 수는 0입니다.");
        }
    }
}
