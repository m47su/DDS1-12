package desafio_topicos_avancados;

import java.util.Scanner;
import java.util.Vector;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class TesteClasseMath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vector numero = new Vector(6); //defini a capacidade inicial do vetor para 6

        System.out.print("DIGITE QUANTOS JOGOS VOCÊ QUER: ");
        int numeroDeJogos = scanner.nextInt();
        numeroDeJogos *= 6; // vai multiplicar a variavel games (jogos)  por 6, então cada jogo terá 6 numeros aleatorios.

        numero.add(0); //faz com que a posição dos numeros comece no index 1, não no 0

        for (int i = 0; i < numeroDeJogos;){
            int n;
            for (int j = 0; j < 6; j++) {
                n = (int) round(random() * 60);
                if ( !numero.contains( n ) ){ numero.add( n ); i += 1; } //verifica se o numero random ja foi selecionado. se não foi selecionado, então adicione ao vetor!!
            }
        }

        for (int i = 1; i < numeroDeJogos +1; i++) {
            System.out.print(numero.get(i) +" ");
            if (i % 6 == 0){ //isso aqui faz pular uma linha entre os vetores. porque o vetor tem 6 posições, e nessa linha fala: se posição for divisivel por 6 e der zero, pule uma linha.
                System.out.println("\n");
            }
        }
    }
}