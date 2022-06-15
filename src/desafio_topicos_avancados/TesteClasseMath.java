package desafio_topicos_avancados;

import static java.lang.Math.random;

public class TesteClasseMath {

    public static void main(String[] args) {

        System.out.println("NÚMEROS QUE VOCÊ PODE JOGAR NA MEGA-SENA:");



        Integer[] numero = new Integer[6];
        numero[0] = (numeroAleatorio());
        numero[1] = (numeroAleatorio());
        numero[2] = (numeroAleatorio());
        numero[3] = (numeroAleatorio());
        numero[4] = (numeroAleatorio());
        numero[5] = (numeroAleatorio());
        for (int i = 0; i < numero.length; i++) {
            System.out.println("[" + (i+1) + "]" + numero[i]);

        }
    }

    private static int numeroAleatorio() {

        int numeroAleatorio = (int) (random() * 60); //vai me dar um numero aleatorio de 1 a 60
        return numeroAleatorio;
    }
}
