package programacao_orientada_a_objetos.desafio_heranca_e_sobrecarga_cafe;
public class ServirCafe{

    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();
        maquina.acucarDisponivel = 30;
        maquina.fazerCafe(10);
        maquina.fazerCafe(15);
        maquina.fazerCafe();
    }
}
