package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONVERSOR DE CELSIUS PARA FAHRENHEIT");

        System.out.print("Digite o número em Celsius: ");
        Double valorFahrenheit = scanner.nextDouble();

        Double conversao = (valorFahrenheit *1.8) + 32;
        Double resultado = conversao;

        System.out.println("Seu valor em Fahrenheit é de " + resultado + "°F");
        scanner.close();
    }
}