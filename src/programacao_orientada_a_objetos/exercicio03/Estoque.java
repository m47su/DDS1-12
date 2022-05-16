package programacao_orientada_a_objetos.exercicio03;

public class Estoque {

    Produto[] produtos;
    void listarprodutos(){
        System.out.println("\nProdutos em estoque");
        System.out.println("----------------------");
        for(int i = 0; i < produtos.length; i++){
            produtos[i].descrever();
        }
    }
}
