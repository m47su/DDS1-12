package desafio_objeto_this_e_construtores;

public class ContaPagar {

    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;  //a variavel tipo FORNECEDOR que eu criei, pode ser o que eu QUISER

    public ContaPagar(){ //preciso colocar o construtor vazio pra utilizar ele

    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {  //esse é o CONSTRUTOR, cria ele clicando com o mouse direito e ir em generator, depois em construtor e selecionar todas
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }
    void pagar(){
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em " + this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");  //o set é basicamente um "scanner" otimizado
        //e mais direto, já o get é apenas para mostrar o que tem no set. e  get está sendo utilizado ai porque é necessario especificar o que eu quero em fornecedor
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}