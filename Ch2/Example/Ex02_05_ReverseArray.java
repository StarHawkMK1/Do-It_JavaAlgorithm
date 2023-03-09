package DoIt.JavaAlgorithm.Ch2.Example;

// 배열 요소에 값을 읽어 들여 역순으로 정렬하기.

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_05_ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {     // 배열 요소 a[idx1]과 a[idx2]의 값을 임시 변수tmp를 활용하여 교환하기.
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void reverse(int[] a) {      // 매개변수로 전달 받은 배열 a의 요소를 역순으로 정렬
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();         // 요솟수를 입력받아 num에 저장.

        int[] x = new int[num];         // 요솟수가 num인 int타입 배열 x 생성.

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        reverse(x);     // 배열 a의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = "  + Arrays.toString(x));
    }                   // 배열의 전체 요소를 표시하는 방법: Arrays.toString() 메서드 활용.
}                       //      Arrays.toString(배열이름)으로 메서드를 호출하면,
                        //      모든 요소를 쉼표(,)로 구분하여 대괄호[]로 둘러싼 문자열로 반환해준다.