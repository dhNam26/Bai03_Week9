package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        MathUtils mathUtils = new MathUtils();
        mathUtils.add(3,4);
        mathUtils.sub(5, 2);
        mathUtils.multiply(4, 3);
        mathUtils.divide(6, 4);

        try {
            mathUtils.divide(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
