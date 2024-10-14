package variable;

// 초기화하지 않은 변수는 에러를 발생한다.
// 지역 변수는 개발자가 초기화를 시켜줘야 한다.
public class Var4 {
    public static void main(String[] args) {
        int a; // 선언
        a = 1; // 초기화
        System.out.println(a);

        int b = 2; // 선언과 초기화
        System.out.println(b);

        int c = 1 , d = 2, e = 3; // 동시 초기화 가능
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
