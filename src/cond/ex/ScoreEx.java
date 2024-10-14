package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        /*
        학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
        90점 이상: "A"
        80점 이상 90점 미만: "B"
        70점 이상 80점 미만: "C"
        60점 이상 70점 미만: "D"
        60점 미만: "F"

        점수는 변수 (int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자.
        */

        int score = 50;
        String result;

        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }

        System.out.println("학점은 " + result + "입니다.");


        /*
        주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자.
        다음과 같은 기준을 따른다.
        거리가 1km 이하면 "도보",
        거리가 10km 이하면 "자전거",
        거리가 100km 이하면 "자동차",
        거리가 100km 초과이면 "비행기",

        거리는 변수 (int distance)로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자.
         */

        int distance = 100;
        String result2;

        if (distance <= 1) {
            result2 = "도보";
        } else if (distance <= 10) {
            result2 = "자전거";
        } else if (distance <= 100) {
            result2 = "자동차";
        } else {
            result2 = "비행기";
        }

        System.out.println(result2 + "를 이용하세요.");


        /*
        특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자.
        환율은 1달러당 1300원이라고 가정합니다. 다음과 같은 기준을 따른다.

        달러가 0 미만이면: 잘못된 금액입니다.
        달러가 0일 때 : 환전할 금액이 없습니다.
        달러가 0 초과일 때: 환전 금액은 (계산된 원화 금액)원 입니다.

        금액은 변수 (int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자.
         */

        int dollar = 5;
        String result3;
        int won;

        if (dollar < 0) {
            result3 = "잘못된 금액입니다.";
        } else if (dollar == 0) {
            result3 = "환전할 금액이 없습니다.";
        } else {
            won = dollar * 1300;
            result3 = "환전 금액은 " + won + " 입니다.";
        }

        System.out.println(result3);
    }
}
