package exercicios;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em METROS QUADRADOS da sua área a ser pintada: ");
        Double metroDaArea = scanner.nextDouble();
        Integer valorQueUmaLataCobreEmMetros = 3;
        Integer valorDeUmaLata = 80;
        Integer quantidadeMinimaDeLatas = 18;
        Double quantidadeDeTintas = metroDaArea / valorQueUmaLataCobreEmMetros;
        Double quantidadeDeTintasReal = quantidadeDeTintas / quantidadeMinimaDeLatas;
        Boolean soPrecisaDeUmaLata = metroDaArea <= valorQueUmaLataCobreEmMetros;
        Double valorTotal = quantidadeDeTintasReal * valorDeUmaLata;
        if(soPrecisaDeUmaLata) {
            System.out.println("Você só precisa de uma lata de tinta, e gastará 80,00 reais.");
        } else {
            System.out.println("A quantidade de latas de tintas é de " + quantidadeDeTintasReal + " e você irá gastar " + valorTotal + " reais");
        }
    }
}