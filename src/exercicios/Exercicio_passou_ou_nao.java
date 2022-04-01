package exercicios;

import java.util.Scanner;

public class Exercicio_passou_ou_nao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite [1] para maior ou igual a 70 / [2] para menor que 70: ");
        Integer notaRecebida = scanner.nextInt();
        Boolean passouDeAno = notaRecebida.equals(1); //true
        System.out.println("Você passou de ano!!");

        if (!passouDeAno) { //false
            System.out.println("Você não passou de ano...");}
        scanner.close();
    }
}
