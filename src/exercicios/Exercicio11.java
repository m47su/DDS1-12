package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu primeiro número (inteiro): ");
        Integer numero1 = scanner.nextInt();

        System.out.print("Digite o seu segundo número (inteiro): ");
        Integer numero2 = scanner.nextInt();

        System.out.print("Digite o seu terceiro número (real): ");
        Double numero3 = scanner.nextDouble();

        Integer equacao1 = (numero1 * 2) + (numero2 / 2);
        Double equacao2 = (numero3 * 3) + numero3;
        Double equacao3 = numero3 * numero3 * numero3;

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + equacao1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + equacao2);
        System.out.println("o terceiro elevado ao cubo é: " + equacao3);

        scanner.close();
    }

}
