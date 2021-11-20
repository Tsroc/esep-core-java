
public class Operators {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Please supply 3 arguments in the format number number operator");
            return;
        }

        int leftOperand = Integer.parseInt(args[0]);
        int rightOperand = Integer.parseInt(args[1]);
        String operator = args[2];
        int result = 0;

        switch(operator){
            case "+":
                result = leftOperand + rightOperand; break;
            case "-":
                result = leftOperand - rightOperand; break;
            case "/":
                result = leftOperand / rightOperand; break;
        }

        System.out.printf("%d %s %d = %d%n", leftOperand,
                operator, rightOperand, result);
    }
}
