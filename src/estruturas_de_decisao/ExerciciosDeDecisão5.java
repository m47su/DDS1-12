package estruturas_de_decisao;
import java.util.Scanner;
public class ExerciciosDeDecisão5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me dê sua primeira nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.print("Me dê sua segunda nota: ");
        Double nota2 = scanner.nextDouble();
        Double somaDasNotas = nota1 + nota2;
        Integer quantidadeDeNotas = 2;
        Double mediaDasNotas = somaDasNotas / quantidadeDeNotas;
        Boolean aprovado = mediaDasNotas >= 7 &&  mediaDasNotas < 10; //esse "&&" escreve "tal numero menor igual a tal >E MENOR QUE DEZ<, ele adiciona mais uma informação, comparação"
        Boolean reprovado = mediaDasNotas < 7;
        Boolean aprovadoComDistincao = mediaDasNotas == 10;
        if (aprovado) {
            System.out.println("Você foi aprovado com a média de " + mediaDasNotas + " pontos");}
        if (reprovado){
                System.out.println("Você foi reprovado com a média de " + mediaDasNotas + " pontos");}
        if (aprovadoComDistincao){
                System.out.println("Você foi aprovado com distinção! Com a média de " + mediaDasNotas + " pontos");}
        scanner.close();
        }
    }

