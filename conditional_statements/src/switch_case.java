import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Taking operator as a single character input
        System.out.println("Enter an operator(+ , -, /, *): ");
        char ope = input.next().charAt(0);

        //Getting first number as an integer input
        System.out.println("Enter first number: ");
        double num_1 = input.nextInt();

        //Getting second number as an integer input
        System.out.println("Enter second number: ");
        double num_2 = input.nextInt();

        //Checking with switch-case
        switch(ope){

            case '+':
                System.out.println("Result: " + (num_1+num_2));
                break;

            case '-':
                System.out.println("Result: " + (num_1-num_2));
                break;

            case '/':
                System.out.println("Result: " + (num_1/num_2));
                break;

            case '*':
                System.out.println("Result: " + (num_1*num_2));
                break;

            default:
                System.out.println("Wrong operator");
                break;

        }


    }
}
