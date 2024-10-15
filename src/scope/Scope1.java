package scope;

public class Scope1 {

    public static void main(String[] args) {

        /*
        임시 변수 temp는 if문 안에서만 사용된다.
        하지만 main 블록 하단에 초기화 되어 있기 때문에
        계속 메모리를 차지하게 되는 비효율적인 코드가 된다.

        temp는 변수 선언 시 고려해야 할 요소가 추가하게 되면서
        변수 선언 시 복잡성을 증가시킨다.
         */

        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
