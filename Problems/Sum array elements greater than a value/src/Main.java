import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <size; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int sum = 0;

        for (int num : arr) {
            if (num > n) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}