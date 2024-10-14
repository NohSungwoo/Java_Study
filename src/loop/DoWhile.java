package loop;

public class DoWhile {
    public static void main(String[] args) {

        int i = 10;

        /*
        while 문과 비슷하게 동작하지만,
        do 부분이 무조건 한 번은 실행된다.
         */
        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);

    }
}
