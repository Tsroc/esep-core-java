import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 100");

        String input = keyboard.nextLine();
        int number = Integer.parseInt(input);
        if(number < 1 || number > 100){
            System.out.println("Number must be between 1 and 100");
            return;
        }


        if(number%2==0 ){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }


        System.out.println("Please enter a number between 1 and 9");
        input = keyboard.nextLine();

        switch(input){
            case "1":
                System.out.println("one"); break;
            case "2":
                System.out.println("two"); break;
            case "3":
                System.out.println("three"); break;
            case "4":
                System.out.println("four"); break;
            case "5":
                System.out.println("five"); break;
            case "6":
                System.out.println("six"); break;
            case "7":
                System.out.println("seven"); break;
            case "8":
                System.out.println("eight"); break;
            case "9":
                System.out.println("nine"); break;
            default:
                System.out.println("Number not in valid range"); break;
        }

    }
}
