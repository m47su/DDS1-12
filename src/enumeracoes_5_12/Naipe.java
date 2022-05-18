package enumeracoes_5_12;

public enum Naipe { //mudei o nome da classe para enum. ele é utilizado para criar valores constantes que nao podem ser modificados
    OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho") ; // sao os valores constantes

    private String cor;

    Naipe(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
}
