package exercicio2;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Temperatura!");
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int choice = scanner.nextInt();
        double temperatura;

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            double temperaturaConvertida = celsiusToFahrenheit(temperatura);
            System.out.println("A temperatura em Fahrenheit é: " + temperaturaConvertida);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            double temperaturaConvertida = fahrenheitToCelsius(temperatura);
            System.out.println("A temperatura em Celsius é: " + temperaturaConvertida);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
