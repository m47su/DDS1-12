package exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAIBA QUANTO VOCÊ RECEBE AO MÊS");

        System.out.print("Digite o quanto você ganha por hora: ");
        Double ganhaPorHora = scanner.nextDouble();

        System.out.print("Digite o seu número de horas trabalhadas ao mês: ");
        Double trabalhaPorHora = scanner.nextDouble();

        Double equacao = ganhaPorHora * trabalhaPorHora;
        Double salario = equacao;

        System.out.println("O seu salário no final do mês é de " + salario + " " + "reais");

        scanner.close();
    }

}
