import java.util.Scanner;

public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        Integer numero = scanner.nextInt();
        scanner.close();

        int resultado = verificaNumerosPrimo(numero);

        if (resultado == 0) {
            System.out.println(numero + " não é um número primo.");
        } else {
            System.out.println(numero + " é um número primo.");
        }
    }

    public static int verificaNumerosPrimo(Integer n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
