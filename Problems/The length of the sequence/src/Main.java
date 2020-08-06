import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1, length = 0;

        while (true) {
           num = scanner.nextInt();
           if(num == 0){
               break;
           }
           length++;
        }

        System.out.println(length);
    }
}