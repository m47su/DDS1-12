package estruturas_de_decisao;
import java.util.Scanner;
public class ExerciciosDeDecisão8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga o preço dos produtos que lhe direi o mais barato a se comprar");
        System.out.print("Me diga o preço do produto um: ");
        Double produto1 = scanner.nextDouble();
        System.out.print("Me diga o preço do produto dois: ");
        Double produto2 = scanner.nextDouble();
        System.out.print("Me diga o preço do produto três: ");
        Double produto3 = scanner.nextDouble();
        Boolean produto1MenorQueTodos = produto1 < produto2 && produto1 < produto3;
        Boolean produtoo2MenorQueTodos = produto2 < produto1 && produto2 < produto3;
        Boolean produto3MenorQueTodos = produto3 < produto1 && produto3 < produto2;
        if (produto1MenorQueTodos) {
            System.out.println("O produto um é o mais barato. Eu lhe recomendaria comprar este.");}
        if (produtoo2MenorQueTodos) {
            System.out.println("O produto dois é o mais barato. Eu lhe recomendaria comprar este.");}
        if (produto3MenorQueTodos) {
            System.out.println("O produto três é o mais barato. Eu lhe recomendaria comprar este.");}
        scanner.close();
    }
}