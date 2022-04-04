//maior que zero = positivo
//menor que zero = negativo


package exercicios;
import java.util.Scanner;
public class ExerciciosDeDecisão2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me dê um valor que direi se ele é positivo ou negativo");
        System.out.println("Digite um número: ");
        Double numero = scanner.nextDouble();
        Boolean maiorQueZero = numero > 0;
        Boolean menorQueZero = numero < 0;
        if (maiorQueZero) {
            System.out.println("O seu número é positivo");}
            if (menorQueZero) {
                System.out.println("Seu número é negativo");

                scanner.close();

            }
        }
    }
