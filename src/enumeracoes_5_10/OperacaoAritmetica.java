package enumeracoes_5_10;

public enum OperacaoAritmetica {
    ADICAO{
        public int operacao(int x, int y) {
            return x + y;
        }

        }, SUBTRACAO {
        @Override //foi reescrito do metodo adicao
        public int operacao(int x, int y) {
            return x - y;
        }
    };
    public abstract int operacao(int x, int y);
}
