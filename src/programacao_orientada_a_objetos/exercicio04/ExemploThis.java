package programacao_orientada_a_objetos.exercicio04;

public class ExemploThis {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.alterarModelo("Civic");
    }
}
