package desafio_interface;

public class ConstrutoraSeguros {

    public void fazerProspostaSeguro(Seguravel objetoSeguravel){ //o objeto seguravel é o objeto que vou colocar, tipo um notebook
        System.out.println("----------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("----------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apolice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("-----------------------------------\n");
    }
}

//essa parte basicamente é so o que vai ser impresso na tela, uma especie de relatiorio. qual a descricao do produto e sua apolice!!!
