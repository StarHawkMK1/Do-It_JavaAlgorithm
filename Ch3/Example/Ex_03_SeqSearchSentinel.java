package DoIt.JavaAlgorithm.Ch3.Example;

import java.util.Scanner;

public class Ex_03_SeqSearchSentinel {
    static int seqSearchSen(int[] a, int n , int key) {
        int i = 0;

        a[n] = key;     // 보초를 추가. (검색할 값 key를 보초로 a[n]에 대입)

        while (true) {
            if (a[i] == key)    // 검색 성공. (하나의 if문만 사용하여 반복 종료에 대한 판단 횟수가 절반으로 감소)
                break;
            i++;
        }
        return i == n ? -1 : i;     // while문에 의한 반복이 완료되면 찾은 값이 배열의 원래 데이터인지 보초인지 판단해야.
    }                               // 변수 i값이 n이면 찾은 값이 보초이므로 검색 실패임을 나타내는 -1을 반환
                                    // 변수 i값이 n이 아니면 찾은 값이 원래 데이터이므로 i값을 반환.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];     // 보초를 위해 요솟수가 num+1인 int타입 배열 x 생성

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");        // 키값을 입력받음.
        int ky = sc.nextInt();

        int idx = seqSearchSen(x, num, ky);   // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }

}
