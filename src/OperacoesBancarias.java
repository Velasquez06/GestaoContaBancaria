public interface OperacoesBancarias {
 void transferir(Conta destino, int valor) throws SaldoInsuficienteException;

 void imprimirExtrato();
}
