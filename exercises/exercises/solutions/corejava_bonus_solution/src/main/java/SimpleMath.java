
public class SimpleMath {
    public static void main(String[] args) {

        double a,b,c,d;

        a=10.0;
        b=20.0;
        c=30.0;
        d=40.0;

        System.out.println("a+b= " + (a+b));
        System.out.println("d+c= " + (d-c));
        System.out.println("c/a= " + (c/a));
        System.out.println("b*d= " + (b*d));
        System.out.println("a%b= " + (a%d));


        // Bonus parts now follow

        double average = (a+b+c+d)/4.0;

        System.out.println("Average of a+b+c+d is " + average);

        double result = (a+b)/(c-d);

        System.out.println("(a+b)/(c-d)= " + result);
    }
}
