package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número");

        Double numero = scanner.nextDouble();

        System.out.println("Seu número é: " + numero);
        scanner.close();
    }
}
