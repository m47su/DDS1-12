package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONVERSOR DE FAHRENHEIT PARA CELSIUS");

        System.out.print("Digite o número em Fahrenheit: ");
        Double valorFahrenheit = scanner.nextDouble();

        Double conversao = (valorFahrenheit - 32) / 1.8;
        Double resultado = conversao;

        System.out.println("Seu valor em Celcius é de " + resultado + "°C");
        scanner.close();
    }
}
