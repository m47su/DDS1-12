package coisas.company.comecando.nomes;

import java.util.Scanner;

public class nomes {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PREENCHA COM NOME E SOBRENOME");

        System.out.println("Digite seu primeiro nome: ");
        String nome1 = scanner.nextLine();

        System.out.println("Digite seu segundo nome: ");
        String nome2 = scanner.nextLine();

        String nomesobrenome = nome1 + nome2;
        System.out.println("Seu nome completo é: " + nome1 + " "+nome2);
        scanner.close();
    }
}