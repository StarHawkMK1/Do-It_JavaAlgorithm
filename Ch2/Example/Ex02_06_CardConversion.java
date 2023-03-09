package DoIt.JavaAlgorithm.Ch2.Example;

import java.util.Scanner;

// 입력받은 10진수를 2진수~36진수로 기수 변환하여 출력하기.
public class Ex02_06_CardConversion {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;     // 반환 후의 자릿수.
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {            // r로 나눈 나머지 저장.
            d[digits++] = dchar.charAt(x % r);
            // x를 r로 나눈 나머지를 인덱스로 하는 문자를 배열 d의 요소 d[digits]에 대입하고 digits값을 1증가시킴.
            x /= r;     // x를 r로 나눔
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {      // 배열 d의 숫자 문자열을 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;                     // 변환하는 정수
        int cd;                     // 기수
        int dno;                    // 변환 후의 자릿수
        int retry;                  // 다시 한번?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변화하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);        // co를 cd진수로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++) {     // 순서대로 출력
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한 번 더 할가요? (1...예 / 0...아니요): ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
