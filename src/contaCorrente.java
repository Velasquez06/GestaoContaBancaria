public class contaCorrente extends Conta  {


    // Constante para cobrar Taxa nas operações
    private static final double taxaOperacao = 0.005;

    // Construtor
    public contaCorrente(int numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }



    // Implementação da Condição Taxa de Operação com uso de Exception
    public void transferir(Conta destino , int valor) throws SaldoInsuficienteException{
        double novoValor = valor + (valor * taxaOperacao);

        if(saldo < novoValor){
            throw new SaldoInsuficienteException("Não é possível fazer essa transferência. Saldo Insuficiante!!");
        }
        this.saldo -= novoValor;
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " realizada com sucesso\n OBS: Taxa de Tranferência aplicada");
    }

    // Metodo da classe Mãe
    @Override
    public void imprimirExtrato(){
        System.out.println("--- Extrato Conta Corrente ---");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public void atualizarSaldo(){
        System.out.println("");
    }
}






