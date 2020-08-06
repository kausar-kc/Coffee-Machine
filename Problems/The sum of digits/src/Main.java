import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int firstDigit = num % 10;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num /100;

        System.out.println(firstDigit + secondDigit + thirdDigit);
    }
}