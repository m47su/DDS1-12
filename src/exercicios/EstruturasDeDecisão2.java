package exercicios;

import java.util.Scanner;

public class EstruturasDeDecisão2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua meta de faturamento anual: ");
        Double metaDeFaturamentoInformada = scanner.nextDouble();

        Integer metaSalarial = 2000;

        //MetaAnual = 30000;

        Boolean limiteDeMetaAnual = metaDeFaturamentoInformada >= 29700;

        Boolean limiteDeMetaAnualTotal = metaDeFaturamentoInformada >= 30000;

        if (!limiteDeMetaAnual) {
            System.out.print("Você não chegou a atingir 80% de sua meta. Então nesse mês, não irá ganhar o seu bônus.");
        }
        if (limiteDeMetaAnual) {
            System.out.print("Seu bônus por ter atingido entre 80%~99% da meta anual é de R$1600,00");
            if (limiteDeMetaAnualTotal) {
                System.out.print("O seu bônus por ter atingido mais que, ou R$30.000 é de: " + metaSalarial + "reais");

                scanner.close();
            }
        }
    }
}
