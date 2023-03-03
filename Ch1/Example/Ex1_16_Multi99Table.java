package DoIt.JavaAlgorithm.Ch1;

// 다중 루프 다루기
// 이중 루프를 활용하여 구구단 곱셈표 출력하기.

public class Ex1_16_Multi99Table {
    public static void main(String[] args) {
        System.out.println("----- 구구단 곱셈표 -----");

        for (int i = 1; i <= 9; i++) {              // 행 루프. 세로 방향 반복
            for (int j = 1; j <= 9; j++) {          // 변수 i값이 1~9까지 증가하면서 행 9번 반복
                System.out.printf("%3d", i * j);    // 열 루프. 가로 방향 반복
            }                                       // 변수 j값도 1~9까지 증가하면서 열 9번 반복
            System.out.println();                   // 열 반복 종료 후 줄 바꿈 실행.
        }
    }
}
