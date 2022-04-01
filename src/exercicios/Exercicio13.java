package exercicios;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SAIBA O SEU PESO IDEAL (HOMEM OU MULHER)");
        System.out.print("Digite a sua altura ");
        Double altura = scanner.nextDouble();
        Double pesoIdealMulher = (72.7 * altura) - 58;
        Double resultado1 = pesoIdealMulher;
        Double pesoIdealHomem =  (62.1 * altura) - 44.7;
        Double resultado2 = pesoIdealHomem;
        System.out.println("O seu peso ideal (mulher) é: " + resultado1);
        System.out.println("O seu peso ideal (homem) é: " + resultado2);
        scanner.close();
    }
}
