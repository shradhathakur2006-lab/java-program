import java.util.Scanner;
public class perimeterandareaofrectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length");
        int length = sc.nextInt();
        System.out.print("enter breadth");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);
    }
}