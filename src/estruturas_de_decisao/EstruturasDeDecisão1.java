package estruturas_de_decisao;
import java.util.Scanner;
public class EstruturasDeDecisão1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua nota de portugues: ");
        Double notaPortugues = scanner.nextDouble();
        System.out.println("Informe a sua nota de matematica: ");
        Double notaMatematica = scanner.nextDouble();
        Boolean limiteDeNota = notaPortugues <= 100 && notaMatematica <= 100;
        if (!limiteDeNota){
            System.out.println("Você inseriu um valor inválido. Aceitamos apenas valores até 100 em cada prova. Por favor, digite novamente");
        }
        if (limiteDeNota) {
            Boolean acimaDaMedia = notaPortugues >= 60 && notaMatematica >= 60;
            if (acimaDaMedia) {
                Double notaFinal = notaPortugues + notaMatematica;
                Boolean passouDeAno = notaFinal >= 150;

                if (passouDeAno) {
                    System.out.println("Você passou de ano com a nota total de: " + notaFinal);
                }
                        else{
                        System.out.println("Você não passou, seu total foi de: " + notaFinal);
                        scanner.close();
                    }
                }
            }
        }
    }






