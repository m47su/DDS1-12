package programacao_orientada_a_objetos;

import java.util.Scanner;
public class ExercicioProduto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Me diga quantos produtos você possui em estoque: ");
        Integer quantidadeRecebida = scanner.nextInt();
        produto.quantidade = 10;
        precisaOuNaoRepor(produto, quantidadeRecebida);

    }
    private static Boolean precisaOuNaoRepor(Produto produto, Integer quantidadeRecebida) {

        Boolean precisaRepor = quantidadeRecebida < produto.quantidade;
       if (precisaRepor) {
           System.out.println("Você precisa repor! Seu estoque está abaixo do limite");

           if (!precisaRepor) {

               System.out.println("Você não precisa repor! Está tudo nos conformes.");
           }
       }
       return null;
       }
    }





