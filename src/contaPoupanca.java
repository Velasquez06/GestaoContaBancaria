public class contaPoupanca extends Conta{
    int numero;
    String titular;
    int saldo;

    // Construtor
    public contaPoupanca(String msg, int numero, String titular, int saldo) {
        super(msg, numero, titular, saldo);
    }

    // Implementação da condição Rendimento Mensal
    @Override
    public double atualizarSaldo(){
        return (saldo *  (0.3 * 100));
    }
}
