package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 1;

        // Java 17부터 개선된 Switch 문법
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
