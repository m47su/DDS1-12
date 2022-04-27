package exercicios;
import java.util.Scanner;
public class Vetores1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe as suas tarefas mais importantes!");
        System.out.print("Me diga aí sua primeira tarefa mais importante: ");
        String tarefaRecebida1 = scanner.nextLine();
        System.out.print("Me diga aí sua segunda tarefa mais importante: ");
        String tarefaRecebida2 = scanner.nextLine();
        System.out.print("Me diga aí sua terceira tarefa mais importante: ");
        String tarefaRecebida3 = scanner.nextLine();
        System.out.print("Me diga aí sua quarta tarefa mais importante: ");
        String tarefaRecebida4 = scanner.nextLine();
        System.out.print("Me diga aí sua quinta tarefa mais importante: ");
        String tarefaRecebida5 = scanner.nextLine();
        String[] tarefa = new String[5];
        tarefa[0] = tarefaRecebida1;
        tarefa[1] = tarefaRecebida2;
        tarefa[2] = tarefaRecebida3;
        tarefa[3] = tarefaRecebida4;
        tarefa[4] = tarefaRecebida5;
        for (int i = 0; i < tarefa.length; i++) {
            System.out.println("[" + (i+1) + "]" + tarefa[i]);
            scanner.close();
        }
    }
}
