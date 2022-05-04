package estruturas_de_decisao;
import java.util.Scanner;
public class ExerciciosDeDecisão3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu sexo. F para feminino e M para masculino: ");
        String letraInformada = scanner.nextLine();
        Boolean letraF = letraInformada.equals("F");
        Boolean letraM = letraInformada.equals("M");
        if (letraF){
            System.out.println("Seu sexo é feminino");}
        else if (letraM){
            System.out.println("Seu sexo é masculino");}
        else{
            System.out.println("Sexo inválido");}
        scanner.close();
        }
}




