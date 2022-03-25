package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAIBA A ÁREA DO SEU CÍRCULO");

        System.out.print("Digite o valor do seu raio: ");
        Double valorDoRaio = scanner.nextDouble();

        Double pi = 3.14;
        Double areaDoCirculo = valorDoRaio * valorDoRaio * pi;
        Double resultado = areaDoCirculo;

        System.out.println("A área do seu círculo é: " + resultado);
        scanner.close();
    }
}