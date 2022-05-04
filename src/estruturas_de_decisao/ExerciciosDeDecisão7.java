package estruturas_de_decisao;
import java.util.Scanner;
public class ExerciciosDeDecisão7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me informe seu primeiro número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Me infome seu segundo número: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Me informe seu terceiro número: ");
        Double numero3 = scanner.nextDouble();
        Boolean numero1MaiorQueTodos = numero1 > numero2 && numero1 > numero3;
        Boolean numero2MaiorQueTodos = numero2 > numero1 && numero2 > numero3;
        Boolean numero3MaiorQueTodos = numero3 > numero1 && numero3 > numero2;
        Boolean numero1MenorQueTodos = numero1 < numero2 && numero1 < numero3;
        Boolean numero2MenorQueTodos = numero2 < numero1 && numero2 < numero3;
        Boolean numero3MenorQueTodos = numero3 < numero1 && numero3 < numero2;
        if (numero1MaiorQueTodos) {
            System.out.println("O numero " + numero1 + " é o maior de todos");
        }
        if (numero2MaiorQueTodos) {
            System.out.println("O numero " + numero2 + " é o maior de todos");}
        if (numero3MaiorQueTodos) {
            System.out.println("O numero " + numero3 + " é o maior de todos");}
        if (numero1MenorQueTodos) {
            System.out.println("O numero " + numero1 + " é o menor de todos");}
        if (numero2MenorQueTodos) {
            System.out.println("O numero " + numero2 + " é o menor de todos");}
        if (numero3MenorQueTodos) {
            System.out.println("O numero " + numero3 + " é o menor de todos");}
        scanner.close();
    }
}
