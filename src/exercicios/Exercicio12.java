package exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAIBA O SEU PESO IDEAL");

        System.out.print("Digite a sua altura ");
        Double altura = scanner.nextDouble();

        Double pesoIdeal = (72.7 * altura) - 58;
        Double resultado = pesoIdeal;

        System.out.println("O seu peso ideal é: " + resultado);
        scanner.close();
    }
}
