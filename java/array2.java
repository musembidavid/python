import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println("tell me how many numbers you want printed in the array");
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());

        for (int a = 0; a < i; a++) {
            System.out.println(arr[a]);
        }
        return;
    }
}
