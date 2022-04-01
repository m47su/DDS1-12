package exercicios;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do seu produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();
        Boolean pagamentoAVista = tipoPagamento.equals(1);
        Double juros = 0.0;
        if (!pagamentoAVista) { //a exclamação deixa o contrario da variavel, ou seja, nesse caso, se pagamento a prazo recebe 10
            juros = 10.0;}
        Double acrescimo = valorProduto * juros / 100;
        Double valorTotal = acrescimo + valorProduto;
        System.out.println("Valor total: " + valorTotal);
        scanner.close();
    }
}