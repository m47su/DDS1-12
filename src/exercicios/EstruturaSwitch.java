package exercicios;
import java.util.Scanner;
public class EstruturaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu número do dia da semana, sabendo que a semana começa do Domingo: ");
        Integer dias = scanner.nextInt();
        String diaDaSemana = scanner.nextLine();
        switch (dias) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-Feira";
                break;
            case 3:
                diaDaSemana = "Terça-Feira";
                break;
            case 4:
                diaDaSemana = "Quarta-Feira";
                break;
            case 5:
                diaDaSemana = "Quinta-Feira";
                break;
            case 6:
                diaDaSemana = "Sexta-Feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                System.err.println("Digite um número válido!");
                System.exit(1);
        }
        System.out.println("O seu dia da semana é " + diaDaSemana);
        scanner.close();

    }
}
