import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number (minimum) ");
        String input = keyboard.nextLine();
        int minimum = Integer.parseInt(input);

        System.out.println("Please enter a second number (maximum) ");
        input = keyboard.nextLine();
        int maximum = Integer.parseInt(input);

        if( minimum < 1 || minimum > 100 ){
            System.out.println("Minimum number " + minimum + " is out of range%n");
            return;
        }
        if( maximum < 1 || maximum > 100 || maximum < minimum){
            System.out.println("Maximum number " + maximum + " is out of range%n");
            return;
        }

        for(int i= minimum; i <= maximum; i++){
            System.out.println(i);
        }

        System.out.println("\nOdd numbers between " + minimum + " and " + maximum);
        for(int i= minimum; i <= maximum; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
