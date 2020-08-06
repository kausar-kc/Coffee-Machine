import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int counter = 1;
        int sequence = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1] < arr[i]) {
                ++counter;
            } else {
                counter = 1;
            }

            if (counter > sequence) {
                sequence = counter;
            }
        }

        System.out.println(sequence);
    }
}