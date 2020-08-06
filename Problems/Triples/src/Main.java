import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int triples = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i-2] == (arr[i-1] - 1) && arr[i-1] == (arr[i] - 1)) {
                ++triples;
            }
        }

        System.out.println(triples);
    }
}