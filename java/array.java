import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println("tell me how many numbers you want printed in the array");
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        for (int a = 0; a < i; a++) {
            System.out.println(arr[a]);
        }
        return;
    }

    public static void execute() {

    }
}
