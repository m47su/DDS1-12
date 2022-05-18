package modificador_de_acesso_default_5_9;

public class Cachorro {
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void sentar(){
        System.out.println("Eu, " + nome + ", vou sentar!"); //esse metodo conseegue acessar o nome sem precisar do get.nome, porque esta a mesma classe. so é necessario por o get
        // em classes diferentes.
    }
}