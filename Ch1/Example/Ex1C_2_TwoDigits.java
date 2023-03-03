package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 논리 연산과 드 모르간의 법칙 활용

public class Ex1C_2_TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("2자리의 양수를 입력하세요.");

        do {                                // do-while문을 활용하여 변수num에 입력한 값이 2자리의 양의 정수인지 확인.
            System.out.print("num값: ");
            num = sc.nextInt();
        } while (num < 10 || 99 < num);

        System.out.println("변수 num값은 " + num + "이 되었습니다.");
    }
}
