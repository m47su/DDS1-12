package coisas.company.comecando;

import java.util.Scanner;

public class CalcularIndiceMassaCorporal {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO DO INDICE DE MASSA CORPORAL");
        System.out.println("Digite seu peso (em KG): ");
        Double peso = scanner.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        Double altura = scanner.nextDouble();
        Double alturaAoQuadrado = altura * altura;
        Double indiceMassaCorporal = peso / alturaAoQuadrado;
        System.out.println("Seu IMC é: " + indiceMassaCorporal);
        scanner.close(); //
    }
}