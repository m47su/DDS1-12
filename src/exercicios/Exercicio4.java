package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAIBA A SUA MÉDIA");
        System.out.print("Digite seu primeiro número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite seu segundo número: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Digite seu terceiro número: ");
        Double numero3 = scanner.nextDouble();
        System.out.print("Digite seu quarto número: ");
        Double numero4 = scanner.nextDouble();
        int divisor = 4;
        Double mediaDoAluno = (numero1 + numero2 + numero3 + numero4) / divisor;
        Double resultado = mediaDoAluno;
        System.out.println("A sua média é: " + resultado);
        scanner.close();
    }
}
