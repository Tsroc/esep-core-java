import java.util.Scanner;

public class NumberSort {

    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int middle=0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter number ");

        String input = keyboard.nextLine();
        int value1 = Integer.parseInt(input);

        System.out.println("Please enter number ");
        input = keyboard.nextLine();
        int value2 = Integer.parseInt(input);

        System.out.println("Please enter number ");
        input = keyboard.nextLine();
        int value3 = Integer.parseInt(input);

        if(value1 < value2){
            min = value1;
        }else{
            min = value2;
        }
        if(value3 < min){
            min = value3;
        }

        if(value1 > value2){
            max = value1;
        }else{
            max = value2;
        }
        if(value3 > max){
            max = value3;
        }

        middle = value1+value2+value3-min-max;


        System.out.println("min: " + min + " middle " + middle + " max " + max);

    }

}
