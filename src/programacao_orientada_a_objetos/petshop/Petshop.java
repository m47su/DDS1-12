package programacao_orientada_a_objetos.petshop;

import java.util.Scanner;
public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cachorro cachorro = new Cachorro();
        System.out.println("SEJA BEM VINDO AO PETSHOP! POR FAVOR, DIGITE AS INFORMAÇÕES DO SEU CACHORRINHO QUE CRIAREI UM ARQUIVO DE TEXTO CHAMADO FICHA PETSHOP PARA ELE");
        System.out.println("ME DIGA SE O SEU PET É MACHO OU FÊMEA: ");
        cachorro.sexo = scanner.nextLine();
        Boolean sexoFemea = cachorro.sexo.equals("Fêmea");
        if (sexoFemea) {
            System.out.println("ME DIGA O NOME DA SUA CACHORRINHA: ");
            cachorro.nome = scanner.nextLine();
            System.out.println("ME DIGA A RAÇA DA SUA CACHORRINHA: ");
            cachorro.raca = scanner.nextLine();
            System.out.println("ME DIGA O NOME DA SUA CACHORRINHA: ");
            cachorro.nome = scanner.nextLine();
            System.out.println("ME DIGA A IDADE DA SUA CACHORRINHA: ");
            cachorro.idade = scanner.nextInt();
        }
        if (!sexoFemea) {
            System.out.println("ME DIGA O NOME DO SEU CACHORRINHO: ");
            cachorro.nome = scanner.nextLine();
            System.out.println("ME DIGA A RAÇA DO SEU CACHORRINHO: ");
            cachorro.raca = scanner.nextLine();
            System.out.println("ME DIGA O NOME DO SEU CACHORRINHO: ");
            cachorro.nome = scanner.nextLine();
            System.out.println("ME DIGA A IDADE DO SEU CACHORRINHO: ");
            cachorro.idade = scanner.nextInt();
        }
        fichaCompleta(cachorro);
    }
    public static void fichaCompleta(Cachorro cachorro) {
        System.out.println("NOME DO PET: " + cachorro.nome + "\n" + "SEXO DO PET: " + cachorro.sexo + "\n" + "RAÇA DO PET: " + cachorro.raca + "\n" + "IDADE DO SEU PET: " + cachorro.idade  );
    }
}
