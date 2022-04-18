package exercicios;

import java.util.Scanner;

public class ExerciciosDeDecisão9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seus três números embaralhados que colocarei em ordem decrescente");
        System.out.print("Me informe seu primeiro número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Me infome seu segundo número: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Me informe seu terceiro número: ");
        Double numero3 = scanner.nextDouble();


        Boolean numeroQueVemNoPrimeiroLugarComUm = numero1 > numero2 && numero1 > numero3;

        Boolean numeroQueVemNoPrimeiroLugarComDois = numero2 > numero1 && numero2 > numero3;

        Boolean numeroQueVemNoPrimeiroLugarComTres = numero3 > numero1 && numero3 > numero2;

        Boolean numeroQueVemNoSegundoLugarComUm = numero1 < numero2 && numero1 > numero3;

        Boolean numeroQueVemNoSegundoLugarComDois = numero2 < numero1 && numero1 > numero3;

        Boolean numeroQueVemNoSegundoLugarComTres = numero3 < numero1 && numero1 > numero2;

        Boolean numeroQueVemNoTerceiroLugarComDois = numero2 < numero1 && numero2 < numero3;

        Boolean numeroQueVemNoTerceiroLugarComTres = numero3 < numero1 && numero3 < numero2;

        if (numeroQueVemNoPrimeiroLugarComUm) {
            if (numeroQueVemNoSegundoLugarComDois)
                if (numeroQueVemNoTerceiroLugarComTres)
                    System.out.println("A sua ordem é: " + numero1 + " " + numero2+ " " + numero3);
        }

        if (numeroQueVemNoPrimeiroLugarComDois) {
            if (numeroQueVemNoSegundoLugarComUm)
                if (numeroQueVemNoTerceiroLugarComTres)
                    System.out.println("A sua ordem é: " + numero2 + " " + numero1 + " " + numero3);
        }

        if (numeroQueVemNoPrimeiroLugarComTres) {
            if (numeroQueVemNoSegundoLugarComTres)
                if (numeroQueVemNoTerceiroLugarComDois)
                    System.out.println("A sua ordem é: " + numero3 + " " + numero2 + " " + numero2);

                            scanner.close();

        }
    }

}



