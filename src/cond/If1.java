package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("성인입니다.");
        } else if (age > 8) {
            System.out.println("미취학 아동입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
    }
}
