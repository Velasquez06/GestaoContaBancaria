public class contaPoupanca extends Conta implements OperacoesBancarias{
    int numero;
    String titular;
    int saldo;

    // Construtor
    public contaPoupanca() {
        super(msg, numero, titular, saldo);
    }

    // Implementação da condição Rendimento Mensal
    @Override
    public double atualizarSaldo(){
        return (saldo *  (0.3 * 100));
    }

    // Implementação dos metodos da Interface

    @Override
    public void transferir() {

    }

    @Override
    public void imprimirExtrato(){

    }
}
