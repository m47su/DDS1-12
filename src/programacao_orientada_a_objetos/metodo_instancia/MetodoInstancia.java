package programacao_orientada_a_objetos.metodo_instancia;

public class MetodoInstancia {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.primeiroNome = "Yasmin";
        cliente.ultimoNome = "Siqueira";
        cliente.telefone = "29 998033575";
        cliente.email = "yasmin@yasmin.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Cassio";
        cliente2.telefone = "51 997438593";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());



    }


}
