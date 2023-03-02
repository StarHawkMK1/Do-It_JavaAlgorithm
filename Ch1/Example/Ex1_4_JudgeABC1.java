package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 입력한 값에 따라 값 출력하기 (if-else if문을 활용한 조건 판단과 분기)

public class Ex1_4_JudgeABC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("A");
        } else if (n == 2){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
