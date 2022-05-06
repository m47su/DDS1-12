package programacao_orientada_a_objetos.estoque;

public class ExercicioEstoque {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();


        estoque.quantidadeRecebida = 13;

        System.out.println(estoque.precisaOuNaoReporEstoque());

    }
}




