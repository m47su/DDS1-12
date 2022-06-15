package desafio_interface;

public class Carro implements Seguravel{
    private double anoFabricacao;
    private double valorMercado;

    public Carro(double anoFabricacao, double valorMercado) {
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado; //valor de mercado é o valor do carro
    }

    @Override
    public String obterDescricao() {
        return "Carro ano " + anoFabricacao + " com valor de mercado " + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado + 0.05;
        if(anoFabricacao < 2000){

            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }
}
