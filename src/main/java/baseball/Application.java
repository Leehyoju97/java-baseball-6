package baseball;

import baseball.domain.Calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Calculator teacher = new Calculator();
        System.out.println(teacher.add(1, 3));
        System.out.println(Calculator.shareResult);

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2000, 21));
        System.out.println(Calculator.shareResult);

        System.out.println(teacher.result); // 4
        System.out.println(Calculator.shareResult); // 2021

        System.out.println(Calculator.SHARE_BIRTHDAY);  // 1104
    }
}
