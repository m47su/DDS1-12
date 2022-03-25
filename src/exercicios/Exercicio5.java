package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONVERSOR DE METROS PARA CENTÍMETROS");

        System.out.print("Digite seu valor em METROS: ");
        Double numeroEmMetros = scanner.nextDouble();

        Double valorEmCentimetros = numeroEmMetros * 100;
        Double resultado = valorEmCentimetros;

        System.out.println("Seu valor em CENTÍMETROS é: " + resultado + "cm");
        scanner.close();
    }
    }
