import java.util.Scanner;

public class Usrpattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will print a pattern of stars");
        String usr = scanner.nextLine();
        int num = Integer.parseInt(usr);
        if (num < 1) {
            num = 5;

        } else if (num > 100) {
            num = 50;
        }

        for (int i = 0; i < num; i++) {
            System.out.println("*");
        }
        scanner.close();
    }
}