import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num>0){
            System.out.println("Positive");
        }
        else if(num==100){
            System.out.println("100");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else if(num==0){
            System.out.println("Zero");
        }



    }
}
