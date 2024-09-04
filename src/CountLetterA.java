import java.util.Scanner;

public class CountLetterA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String msg = sc.nextLine();

        int count = 0;

        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        System.out.println("A letra 'a' ou 'A' está presente " + count + " vezes.");
        sc.close();
    }
}