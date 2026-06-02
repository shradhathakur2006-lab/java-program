import java.util.Scanner;
public class SquareCube{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
     System.out.print("enter a number");
        int n = sc.nextInt();
        System.out.println("Sqare="+(n*n));
        System.out.println("Cube="+(n*n*n));
 }
}