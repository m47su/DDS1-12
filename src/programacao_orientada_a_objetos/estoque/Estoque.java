package programacao_orientada_a_objetos.estoque;

public class Estoque {


    static final Integer quantidadeMinimaDeEstoque = 10;


    Integer quantidadeRecebida;

    public Boolean precisaOuNaoReporEstoque() {

        Boolean precisaRepor = quantidadeRecebida < quantidadeMinimaDeEstoque;
        if (precisaRepor) {
            System.out.println("Você precisa repor! Seu estoque está abaixo do limite");
        }
            if (!precisaRepor) {
                System.out.println("Você não precisa repor! Está tudo nos conformes.");
            }
        return precisaRepor;
    }
}