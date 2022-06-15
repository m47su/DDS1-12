package desafio_interface;

public class Imovel implements Seguravel {
    private int areaConstruida;
    private double valorMercado;

    public Imovel(int areaConstruida, double valorMercado) {
        this.areaConstruida = areaConstruida;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescricao() {
        return "Imóvel com área construída de " + areaConstruida + "m2 e no valor de mercado " + valorMercado;
    }

    @Override
    public double calcularValorApolice() {

        double valorApolice = valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.5); //poderia ser qualquer calculo ficticio, o enunciado nao pediu um especificamente
        return valorApolice;
    }
}