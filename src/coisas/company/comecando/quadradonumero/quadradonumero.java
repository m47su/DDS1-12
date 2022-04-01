package coisas.company.comecando.quadradonumero;

import java.util.Scanner;

public class quadradonumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA NUMERO AO QUADRADO");

        System.out.println("Digite um número ");
        Double numero = scanner.nextDouble();

        Double numeroaoquadrado = numero * numero;
        Double quadradonumero = numeroaoquadrado;
        System.out.println("Seu resultado é: " + quadradonumero);
        scanner.close();
    }
}
