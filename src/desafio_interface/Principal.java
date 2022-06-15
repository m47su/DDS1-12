package desafio_interface;

public class Principal {

    public static void main(String[] args) {
        ConstrutoraSeguros construtoraSeguros = new ConstrutoraSeguros(); //injetei a corretora seguros pq preciso dela
        Carro carro =  new Carro(2021, 45000); //injetei o carro porque quero fazer um teste com ele!!
        Imovel imovel = new Imovel(92800, 15000);
        construtoraSeguros.fazerProspostaSeguro(carro);
        construtoraSeguros.fazerProspostaSeguro(imovel);
    }
}
