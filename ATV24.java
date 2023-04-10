
import java.util.Scanner;

public class ATV24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você deseja verificar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println(num + " é positivo.");
            } else if (num < 0) {
                System.out.println(num + " é negativo.");
            } else {
                System.out.println(num + " é zero.");
            }
        }

        sc.close();
    }
}
