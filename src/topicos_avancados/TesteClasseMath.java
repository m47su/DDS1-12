package topicos_avancados;


import static java.lang.Math.*;

public class TesteClasseMath {

    public static void main(String[] args) {
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento " + comprimento);

        double[] precosProdutoA = {30.20, 25.59};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + min(precosProdutoA[0], precosProdutoA[1]));

        System.out.println("2^3: " + pow(2, 3)); // calcular potencia

        System.out.println("Raiz de 9: " + sqrt(9)); //calcular raiz

        double n = 5.4;

        System.out.println("Menor inteiro: " + floor(n)); //vai arredondar o 5.4 para o menor numero mais proximo, no caso 5
        System.out.println("Maior inteiro: " + ceil(n)); //vai arredondar o 5.4 para o maior numero mais proximo, no caso 6
        System.out.println("Arredondando: " + round(n)); //vai arredondar o 5.4 para o numero mais proximo, ou grande ou pequeno, arredondamento de numeros normal

        System.out.println("Seno: " + sin(40)); //calcula o seno de um numero

        double numeroAleatorio = random() * 60; //vai me dar um numero aleatorio
        System.out.println(numeroAleatorio);

    }
}
