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


        // Bonus part

        double c = 10.55;
        double d = 9.21;

        double doubleResult = calculator.add(c,d);

        System.out.printf("%f + %f = %f%n", c, d, doubleResult);

        doubleResult = calculator.subtract(c,d);

        System.out.printf("%f  %f = %f%n", c, d, doubleResult);

        doubleResult = calculator.divide(c,d);

        System.out.printf("%f / %f = %f%n", c, d, doubleResult);

        doubleResult = calculator.multiply(c,d);

        System.out.printf("%f * %f = %f%n", c, d, doubleResult);





    }
}
