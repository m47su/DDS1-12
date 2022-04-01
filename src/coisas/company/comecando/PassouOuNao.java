package coisas.company.comecando;

import java.util.Scanner;

public class PassouOuNao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a sua nota?");
        Double notaDoAluno = scanner.nextDouble();

        Boolean passouDeAno = notaDoAluno <= 70;

        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ano!");

        } else {
            System.out.println("Ohh não... infelizmente você não passou");
        }
    }
}
