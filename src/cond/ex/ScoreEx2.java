package cond.ex;

public class ScoreEx2 {
    public static void main(String[] args) {
        /*
        요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.

        어바웃 타임 - 평점 9
        토이 스토리 - 평점 8
        고질라 - 평점 7

        평점 변수는 double rating을 사용하세요. if 문을 활용해서 문제를 풀자.
         */

        double rating = 7.1;
        String time = "어바웃 타임";
        String toy = "토이 스토리";
        String monster = "고질라";
        String result1;

        if (rating <= 7){
            System.out.println(time + ", " + toy + ", " + monster + "를 추천합니다");
        } else if (rating <= 8) {
            System.out.println(time + ", " + toy + "을 추천합니다");
        } else if (rating == 9) {
            System.out.println(time + "을 추천합니다");
        } else {
            System.out.println("추천 목록이 없습니다.");
        }


        /*
        String grade라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자.
        각 학점은 다음과 같은 성취도를 나타낸다.

        A : 탁월한 성과입니다.
        B : 좋은 성과입니다.
        C : 준수한 성과입니다.
        D : 향상이 필요합니다.
        F : 불합격입니다.
        나머지 : 잘못된 학점입니다.

        switch 문을 사용해서 문제를 해결하자.
         */

        String grade = "B";
        String result;

        switch (grade) {
            case "A":
                result = "탁월한 성과입니다.";
                break;
            case "B":
                result = "좋은 성과입니다.";
                break;
            case "C":
                result = "준수한 성과입니다.";
                break;
            case "D":
                result = "향상이 필요합니다.";
                break;
            case "F":
                result = "불합격입니다.";
                break;
            default:
                result = "잘못된 학점입니다.";
        }

        System.out.println(result);

        result = switch (grade){
            case "A" -> "탁월한 성과입니다.";
            case "B" -> "좋은 성과입니다.";
            case "C" -> "준수한 성과입니다.";
            case "D" -> "향상이 필요합니다.";
            case "F" -> "불합격입니다.";
            default -> "잘못된 학점입니다.";
        };
       System.out.println(result);


       /*
       여러분은 두 개의 정수 변수 a와 b를 가지고 있다.
       a의 값은 10이고
       b의 값은 20이다.
       삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
        */

        int a = 10;
        int b = 20;
        int result2 = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + result2 + "입니다.");


        /*
        정수 x가 주어지면
        x가 짝수이면 "짝수"를,
        x가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자.
        삼항 연산자를 사용해야 한다.
         */

        int x = 10;
        String result3 = (x % 2) == 0 ? "짝수" : "홀수";

        System.out.println(result3);
    }
}
