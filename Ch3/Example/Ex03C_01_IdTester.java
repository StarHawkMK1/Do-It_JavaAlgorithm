package DoIt.JavaAlgorithm.Ch3.Example;

// id를 부여하는 클래스
// 인스턴스 변수/메서드 & 클래스 변수/메서드 구분하기

class Id {
    private static int counter = 0;     // id를 몇 개 부여했는지 저장. <클래스 변수>
    private int id;                     // id <인스턴스 변수>

    public Id() {                       // 생성자
        id = ++counter;
    }

    public static int getCounter() {    // counter를 반환 <클래스 메서드>
        return counter;
    }

    public int getId() {
        return id;                      // id를 반환. <인스턴스 메서드>
    }
}

public class Ex03C_01_IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수: " + Id.getCounter());
    }
}

