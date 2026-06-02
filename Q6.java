import java.util.Scanner;
public class ArithmeticOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int a=sc.nextInt();
        System.out.print("enter second number");
        int b=sc.nextInt();
        System.out.print("Addition="+(a+b));
        System.out.print("Subtraction="+(a-b));
        System.out.print("Multiplication="+(a*b));
        System.out.print("Division="+(a/b));
        System.out.print("Modulus="+(a%b));
        }
}