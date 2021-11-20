import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = keyboard.nextLine();


        StringBuilder reverseInput = new StringBuilder(input);
        reverseInput.reverse();
        String reverseInputString = reverseInput.toString();

        if(reverseInputString.equals(input)){
            System.out.printf("%s is a palindrome", input);
        }else{
            System.out.printf("%s is not a palindrome", input);
        }
    }
}
