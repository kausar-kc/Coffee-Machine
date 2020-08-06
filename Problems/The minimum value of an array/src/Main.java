import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int minimum = arr[0];

        for (int num : arr) {
            if (num < minimum) {
                minimum = num;
            }
        }

        System.out.println(minimum);
    }
}