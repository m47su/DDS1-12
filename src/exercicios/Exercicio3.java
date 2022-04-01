package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ADIÇÃO DE DOIS NÚMEROS");
        System.out.println("Digite seu primeiro número: ");
        Double numero1 = scanner.nextDouble();
        System.out.println("Digite seu segundo número: ");
        Double numero2 = scanner.nextDouble();
        Double somaDoisNumeros = numero1 + numero2;
        Double resultado = somaDoisNumeros;
        System.out.println("Seu resultado é: " + resultado);
        scanner.close();
    }
}
