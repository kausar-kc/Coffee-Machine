import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int square = 0;
        int number = 1;

        while (true) {
            square = number * number;
            if (square > N) {
                break;
            }
            System.out.println(square);
            number++;
        }
    }
}