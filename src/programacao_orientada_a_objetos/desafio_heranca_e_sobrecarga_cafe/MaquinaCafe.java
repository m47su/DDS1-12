package programacao_orientada_a_objetos.desafio_heranca_e_sobrecarga_cafe;

public class MaquinaCafe {

    private int acucarDisponivel = 1000;


    int acucarDesejado = 50;

    Boolean quantidadeDeAcucar;

    public void fazerCafe() {

        if(quantidadeDeAcucar) {

            int resultado = (acucarDisponivel - acucarDesejado);

            Boolean daPraFazer = resultado < acucarDisponivel;

            if(daPraFazer) {

                System.out.println("Seu café está sendo pronto com a quantidade " + acucarDesejado + "gramas." + "Ainda têm " + resultado + " gramas de açúcar");

            }
            else if (quantidadeDeAcucar)
                System.out.println("A quantidade de café que você deseja é indisponível no momento");


        }
    }
}
