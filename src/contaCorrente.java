public class contaCorrente extends Conta implements OperacoesBancarias {
    int numero;
    String titular;
    int saldo;
    double novoSaldo;

    // Construtor
    public contaCorrente() {
        super(msg, numero, titular, saldo);
        this.novoSaldo = novoSaldo;
    }



    // Implementação da Condição Taxa de Operação com uso de Exception
    public void TaxaOpereacao(int saldo, double novoSaldo, int valorTransferencia) throws SaldoInsuficienteException{
        valorTransferencia = (int) (saldo - (0.5 * 100));
        if (valorTransferencia > saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente para transferência!! " + saldo + " | Saldo disponível: " + valorTransferencia);
        }
        novoSaldo = (saldo - valorTransferencia);
        System.out.println("O valor atual é: " + novoSaldo);
    }

    // Metodo da classe Mãe
    @Override
    public double atualizarSaldo(){
        return novoSaldo;
    }

    // Implementação dos metodos da interface
    @Override
    public void transferir() {
        System.out.println("A conta que vai receber será: " + destino);
    }

    @Override
    public void imprimirExtrato(){

    }
}






