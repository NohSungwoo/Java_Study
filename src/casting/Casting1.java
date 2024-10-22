package casting;

public class Casting1 {

    public static void main(String[] args) {

        /*
        자동 형변환
        int < long < double

        더 큰 수까지 표현이 가능하다면 형변환시킬 수 있지만
        작은 수까지 표현 가능한 형으로는 변환이 불가능하다.

        메모리 오버플로우

        doubleVar = (double)intVar
        이런 식으로 동작한다.
         */

        int intVar = 10;
        long longVar;
        double doubleVar;

        longVar = intVar;
        doubleVar = longVar;
    }
}
