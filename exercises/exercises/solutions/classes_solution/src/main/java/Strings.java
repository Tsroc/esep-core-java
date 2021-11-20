import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = keyboard.nextLine();

        for(int i=input.length()-1; i >= 0; i--){
            System.out.printf("%c", input.charAt(i));
        }


        System.out.println("\nPlease enter an alphabetic string");
        input = keyboard.nextLine();
        input = input.toUpperCase();

        for(int i=0; i < input.length(); i++){
            switch(input.charAt(i)){
                case 'A': case 'B': case 'C':
                    System.out.print("2"); break;
                case 'D': case 'E': case 'F':
                    System.out.print("3"); break;
                case 'G': case 'H': case 'I':
                    System.out.print("4"); break;
                case 'J': case 'K': case 'L':
                    System.out.print("5"); break;
                case 'M': case 'N': case 'O':
                    System.out.print("6"); break;
                case 'P': case 'Q': case 'R':
                    System.out.print("7"); break;
                case 'S': case 'T': case 'U':
                    System.out.print("8"); break;
                case 'W': case 'X': case 'Y': case 'Z':
                    System.out.print("9"); break;
            }
        }
    }
}
