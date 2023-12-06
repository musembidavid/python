import java.util.Scanner;

public class Learning {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("calculator");

        System.out.println("enter first number");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("enter second number");
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = num1 * num2;

        System.out.println(sum);
        scanner.close();
    }
}