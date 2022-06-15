package desafio_polimorfismo_e_classes_abstratas;

public class RelatorioContas {


    public void exibirListagem(Conta[] contas) {

        for (int i = 0; i < contas.length; i++){
            System.out.println("Conta" + contas[i].getDescricao() + "\n paga esse valor " + contas[i].getValor());
        }
    }
}
