package programacao_orientada_a_objetos.exercicio03;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos produtos deseja cadastrar?");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); //é necessario mais um scanner.nexline porque os scanners de numero travam apenas em scannear o numero, não pulando pra linha de baixo
        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[quantidadeProdutos]; //declarei um vetor de produto dentro de outra classe
        for (int i = 0; i < estoque.produtos.length; i++) {
            estoque.produtos[i] = new Produto();
            System.out.println("\nProduto " + i);
            System.out.println("---------------");
            System.out.println("Informe a descrição do produto: ");
            estoque.produtos[i].descricao = scanner.nextLine();
            System.out.println("Informe a quantidade de itens: ");
            estoque.produtos[i].quantidade = scanner.nextInt();
            scanner.nextLine();
        }
        estoque.listarprodutos();
    }
}
