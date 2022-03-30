package exercicios;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo em MB: ");
        Double tamanhoDoArquivo = scanner.nextDouble();
        System.out.println("Informe a velocidade de download em Mbps: ");
        Double velocidadeDoLinkDeInternet = scanner.nextDouble();
        Byte fatorDeConversaoEmSegundos = 8;
        Double tempoAProximadodeDownloadEmMinutos = tamanhoDoArquivo / (velocidadeDoLinkDeInternet / fatorDeConversaoEmSegundos);
        Byte fatorDeConversaoEmMinutos = 60;
        Double tempoAProximadoDeDownloadEmMinutos = tempoAProximadodeDownloadEmMinutos / fatorDeConversaoEmMinutos;
        System.out.println("O tempo aproximado de download é de: " + tempoAProximadoDeDownloadEmMinutos + " minutos");
        scanner.close();
    }
}
