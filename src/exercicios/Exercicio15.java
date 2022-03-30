package exercicios;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o quanto você ganha por hora: ");
        Double ganhaPorHora = scanner.nextDouble();
        System.out.print("Digite o seu número de horas trabalhadas ao mês: ");
        Double trabalhaPorHora = scanner.nextDouble();
        Double salarioAoMes = ganhaPorHora * trabalhaPorHora;
        Double salario = salarioAoMes;
        Integer valorImpostoDeRenda = 11;
        Double impostoDeRenda = (salario / 100) * valorImpostoDeRenda;
        Integer valorDoINNS = 8;
        Double INSS = (salario / 100) * valorDoINNS;
        Integer valorSindicato = 5;
        Double sindicato = (salario / 100) * valorSindicato;
        Double valorBruto = salario;
        Double salarioLiquido = valorBruto - (impostoDeRenda + INSS + sindicato);
        System.out.println("O seu salário líquido é de: " + salarioLiquido + " " + "reais");
        System.out.println("O seu imposto de renda é de: " + impostoDeRenda + " " + "reais");
        System.out.println("Você pagou " + INSS + " " + "reais ao INSS");
        System.out.println("Você pagou " + sindicato + " " + "reais ao sindicato");
        System.out.println("O seu valor bruto é de: " + valorBruto + " " + "reais");
        scanner.close();
    }
}