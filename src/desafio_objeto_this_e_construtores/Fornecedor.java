package desafio_objeto_this_e_construtores;

public class Fornecedor {

    String nome;
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {      //simplesmente diz que nome recebido é igual a nome
        this.nome = nome;
    }
}
