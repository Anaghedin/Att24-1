
import java.util.Scanner;

public class att24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você deseja verificar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Digite o " + i + "º número: ");
                String input = sc.next();
                if (input.matches("-?\\d+")) {
                    num = Integer.parseInt(input);
                    validInput = true;
                } else {
                    System.out.println("Entrada inválida - Digite apenas números");
                }
            }

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
