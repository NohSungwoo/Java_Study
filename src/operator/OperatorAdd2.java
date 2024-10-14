package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++; // b에 대입을 먼저하고 증가시키기 때문에 b = 1
        System.out.println("a = " + a + ", b = " + b);
    }
}
