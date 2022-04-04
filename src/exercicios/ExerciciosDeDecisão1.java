package exercicios;

import java.util.Scanner;

public class ExerciciosDeDecisão1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me dê o seu primeiro número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Me dê o seu segundo número: ");
        Double numero2 = scanner.nextDouble();
        Boolean numeroUmMaiorQueDois = numero1 > numero2;
        if (numeroUmMaiorQueDois) {
            System.out.println("Seu maior número é " + numero1);}
        if (!numeroUmMaiorQueDois) {
            System.out.println("Seu maior número é " + numero2);}
        scanner.close();
    }
}




