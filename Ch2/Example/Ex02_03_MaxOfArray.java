package DoIt.JavaAlgorithm.Ch2.Example;

// 배열 요소의 최댓값을 구하는 예제

import java.util.Scanner;

public class Ex02_03_MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;         // 배열 a의 최댓값을 구하여 반환하는 메서드
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = sc.nextInt();         // 배열의 요솟수(사람 수)를 입력받아 num에 저장.
        
        int[] height = new int[num];    // 요솟수가 num인 int타입 배열 height 생성

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "]: ");
            height[i] = sc.nextInt();   // 각 요소에 넣을 값(키)를 입력받음.
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");   // 배열 height를 메서드 maxOf에 전달하고 최댓값 출력.
    }
}
