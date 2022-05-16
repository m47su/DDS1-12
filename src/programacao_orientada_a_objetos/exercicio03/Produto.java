package programacao_orientada_a_objetos.exercicio03;

public class Produto {

     String descricao;
     int quantidade;
     void descrever(){ //void é sempre acompanhado pelo método

         System.out.println(descricao + " - " + quantidade + " itens");
     }
}
