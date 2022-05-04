package estruturas_de_decisao;

import java.util.Scanner;

public class ExerciciosDeDecisão4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letraInformada = scanner.nextLine();


        Boolean letraA = letraInformada.equals("A");
        Boolean letraE = letraInformada.equals("E");
        Boolean letraI = letraInformada.equals("I");
        Boolean letraO = letraInformada.equals("O");
        Boolean letraU = letraInformada.equals("U");

        if (letraA) {
            System.out.println("Sua letra é uma VOGAL");
            if (letraE)
                System.out.println("Sua letra é uma VOGAL");
            if (letraI)
                System.out.println("Sua letra é uma VOGAL");
            if (letraO)
                System.out.println("Sua letra é uma VOGAL");
            if (letraU)
                System.out.println("Sua letra é uma VOGAL");}
            else {
                System.out.println("Sua letra é uma CONSOANTE");

                scanner.close();
            }
        }
    }














