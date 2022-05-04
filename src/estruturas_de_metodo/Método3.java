package estruturas_de_metodo;

import java.util.Scanner;

public class Método3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] operacoes = new String[]{"Adição", "Substração"};

        imprimir("Escolha uma operação: ");

        mostrarAsOpcoes(operacoes);
        Integer opcaoEscolhida = scanner.nextInt();

        imprimir("Digite o primeiro número:  ");
        Double primeiroNumero = scanner.nextDouble();


        imprimir("Digite o seu segundo número: ");
        Double segundoNumero = scanner.nextDouble();

        Boolean contaAdicao = opcaoEscolhida.equals(1);


        if (contaAdicao) {

            Double resultado = (primeiroNumero + segundoNumero);

            imprimir("Seu resultado é: " + resultado);

        }

        if (!contaAdicao) {
            Double resultado = (primeiroNumero - segundoNumero);
            imprimir("Seu resultado é: " + resultado);
        }

    }


    static void imprimir(String texto) {
        System.out.println(texto);
    }


    static void mostrarAsOpcoes(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            imprimir("[" + (i + 1) + "] " + vetor[i]);

        }

    }
}