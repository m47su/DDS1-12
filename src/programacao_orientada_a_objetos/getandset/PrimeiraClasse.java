package programacao_orientada_a_objetos.getandset;

public class PrimeiraClasse {

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setCodigo("O código do produto é: 56740702469");
        produto.setDesconto("O desconto do produto é: 15%");
        produto.setSubtotal("O valor do produto é de: 1000 reais");
        produto.setTotal("O valor final do produto é de: 850 reais");


        System.out.println(produto.codigo + "\n" + produto.subtotal + "\n" + produto.desconto + "\n" + produto.total);

    }

}
