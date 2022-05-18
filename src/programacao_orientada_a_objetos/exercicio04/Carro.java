package programacao_orientada_a_objetos.exercicio04;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo){
        if(modelo != null){ //ele so faz esse if se o modelo for diferente de null
            this.modelo = modelo; //"this" está conectado com "carro"

        }


    }
}
