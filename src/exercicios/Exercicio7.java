package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULE O DOBRO DA SUA ÁREA QUADRADA");

        System.out.print("Digite a sua base: ");
        Double base = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        Double altura = scanner.nextDouble();

        Double areaDoQuadrado = base * altura;
        Double resultado = areaDoQuadrado;

        Double dobroDaArea = resultado * 2;
        Double resultadoFinal = dobroDaArea;

        System.out.println("O dobro da sua área é: " + resultadoFinal);

        scanner.close();
    }
}
