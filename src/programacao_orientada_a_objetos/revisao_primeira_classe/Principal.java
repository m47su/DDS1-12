package programacao_orientada_a_objetos.revisao_primeira_classe;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Preto";

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
    }
}





