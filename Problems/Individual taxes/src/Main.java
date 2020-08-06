import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] yearlyIncomes = new int[N];
        int[] taxes = new int[N];
        int num = 1;

        for (int i = 0; i < N; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            taxes[i] = scanner.nextInt();
        }

        double percentage = 0.0;
        double highestPercentage = 0.0;

        for (int i = 0; i < N; i++) {
            percentage = (double)taxes[i]/100.0 * yearlyIncomes[i];
            if (percentage > highestPercentage)
            {
                highestPercentage = percentage;
                num = i + 1;
            }
        }

        System.out.println(num);

    }
}