package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        /*
        문자열 비교는 .equals() 메서드를 사용한다.
        특정 상황에서 == 으로 비교하면 틀린 답이 나온다.
         */
    }
}
