import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a binary string (1's and 0's)");
        String input = keyboard.nextLine();

        double result = 0.0;
        for(int i=0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                result = result + Math.pow(2, input.length()-1-i);
            }
        }
        System.out.printf("%s binary is %d decimal%n",
                input,(int)result );

        System.out.printf("The alternative way:%n%s binary is %d decimal%n",
                input,Integer.parseInt(input, 2) );
    }
}
