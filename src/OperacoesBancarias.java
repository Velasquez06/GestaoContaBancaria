public interface OperacoesBancarias {
    void transferir();

    double VALOR = 10000;
    Conta destino = null;

    void imprimirExtrato();

    boolean IMPRIME = true;
}
