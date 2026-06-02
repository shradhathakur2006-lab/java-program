import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int s4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int s5 = sc.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = (total / 500.0) * 100;

        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}