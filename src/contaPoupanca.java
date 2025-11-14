public class contaPoupanca extends Conta {
    private static final double rendimentoMensal = (0.03 * 100);

    // Construtor
    public contaPoupanca(int numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }


    @Override
    public void transferir(Conta destino, int valor) throws SaldoInsuficienteException{
        if(saldo < valor) {
            throw new SaldoInsuficienteException("\n Saldo insuficiente para transferência.");
        }

        this.saldo -= valor;
        destino.depositar(valor);
        System.out.println("\n Transferência de R$" + valor + " realizadado com sucesso");
    }



    @Override
    public void imprimirExtrato(){
        System.out.println("\n --- Extrato Conta Poupança ---");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo atual: " + getSaldo());
    }

    // Implementação da condição Rendimento Mensal
    @Override
    public void atualizarSaldo(){
        double rendimento = saldo * rendimentoMensal;
        int novoSaldo = saldo += rendimento;
        System.out.println("\n Saldo de " + getTitular() + " atualizado com sucesso.\n O novo saldo possuindo rendimento mensal é de: " + novoSaldo);
    }
}