public class CalculatorDriver {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 10, b = 20;

        int result = calculator.add(a,b);

        System.out.printf("%d + %d = %d%n", a, b, result);

        result = calculator.subtract(a,b);

        System.out.printf("%d  %d = %d%n", a, b, result);

        result = calculator.divide(a,b);

        System.out.printf("%d / %d = %d%n", a, b, result);

        result = calculator.multiply(a,b);

        System.out.printf("%d * %d = %d%n", a, b, result);


    }
}
