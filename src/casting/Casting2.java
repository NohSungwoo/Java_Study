package casting;

public class Casting2 {

    public static void main(String[] args) {

        /*
        명시적 형변환

        큰 범위에서 작은 범위로 형변환 시킬 때는
        명시적인 변환이 필요하다.
         */

        double doubleVar = 1.5;
        int intVar = (int)doubleVar;

        System.out.println(intVar);


        // 만약 강제 형변환 시키게 되면 오버 플로우가 발생한다.
        long maxIntVar = 2147483647;
        long maxIntOver = 2147483648L;
        intVar = 0;

        intVar = (int) maxIntOver; // 형변환
        System.out.println("intVar = " + intVar);
    }
}
