package DoIt.JavaAlgorithm.Ch3.Example;

// for문을 이용한 선형검색

import java.util.Scanner;

public class Ex03_02_SeqSearchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();         // 사용자로부터 정숫값을 입력받아 변수 num에 저장
        int[] x = new int[num];         // 요솟수가 num인 int타입 배열 x

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");        // 사용자로부터 키값을 입력받음.
        int ky = sc.nextInt();
        int idx = SeqSearch.seqSearch(x, num, ky);      // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

class SeqSearchFor {       // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색.
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }
}
