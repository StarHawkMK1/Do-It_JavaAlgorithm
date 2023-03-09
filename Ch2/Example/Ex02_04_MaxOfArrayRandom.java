package DoIt.JavaAlgorithm.Ch2.Example;

// 난수를 사용하여 배열의 요솟값 설정하기

import java.util.Random;
import java.util.Scanner;

public class Ex02_04_MaxOfArrayRandom {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();                 // Random() 클래스형의 변수를 만들기 위한 선언.
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = sc.nextInt();                     // 사람 수에 해당하는 배열의 요솟수를 입력받아 num에 저장.

        int[] height = new int[num];                // 요솟수가 num인 int타입 배열 height 생성.

        System.out.println("킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {                   // 킷값 결정.
            height[i] = 100 + rand.nextInt(90);     // 변수 rand에 대하여 난수를 생성하는 메서드 nextInt()를 호출. 요솟값을 난수로 결정
            System.out.println("height[" + i + "]: " + height[i]);      // 100~189의 킷값 출력
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");   // 최댓값 결정
    }
}
