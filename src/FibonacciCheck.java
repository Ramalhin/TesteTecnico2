import java.util.Scanner;

public class FibonacciCheck {

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, temp;

        if (num == 0 || num == 1) {
            return true;
        }

        while (b <= num) {
            temp = a + b;
            a = b;
            b = temp;

            if (b == num) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }
        System.out.println("E a sequência é :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34...");
        sc.close();
    }
}