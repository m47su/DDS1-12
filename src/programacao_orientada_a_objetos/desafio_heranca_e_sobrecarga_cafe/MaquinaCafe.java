package programacao_orientada_a_objetos.desafio_heranca_e_sobrecarga_cafe;

public class MaquinaCafe {

    int acucarDisponivel;

    void fazerCafe() {
        fazerCafe(10);
    }

    void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar) {
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        }
    }
}