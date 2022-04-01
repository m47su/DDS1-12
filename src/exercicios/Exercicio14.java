package exercicios;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de KG de peixe: ");
        Double valorKgPeixe = scanner.nextDouble();
        Boolean taxaPeixe = valorKgPeixe > 50;
        if (taxaPeixe) {
            Double excesso = valorKgPeixe - 50;
            Double taxa = valorKgPeixe * 4;
            System.out.println("O valor em excesso é: " + excesso + "KG");
            System.out.println("O valor da taxa é de: " + taxa + " " + "reais");
        } else {
            System.out.println("Você está dentro da norma");
                }
                }
                }