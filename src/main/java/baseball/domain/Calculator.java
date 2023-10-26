package baseball.domain;

public class Calculator {
    public static final int SHARE_BIRTHDAY = 1104;  // 상수 - 클래스 변수인데 변하지 않는 값
    public static int shareResult = 0; // 클래스 변수

    public int result = 0;  // 인스턴수 변수

    public Calculator() {
    }

    public int add(int number1, int number2) {  // 메소드 (인스턴스 메소드)
        result = number1 + number2;
        shareResult = result;
        return result;
    }
}
