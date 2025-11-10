public class contaPoupanca extends Conta {
    private static final double rendimentoMensal = 0.003;

    // Construtor
    public contaPoupanca(int numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }


    @Override
    public void transferir(Conta destino, int valor) throws SaldoInsuficienteException{
        if(saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferência.");
        }

        this.saldo -= valor;
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " realizadad com sucesso");
    }



    @Override
    public void imprimirExtrato(){
        System.out.println("--- Extrato Conta Corrente ---");
        System.out.println("Titular: " + getTitular());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo atual: " + getSaldo());
    }

    // Implementação da condição Rendimento Mensal
    @Override
    public void atualizarSaldo(){
        double rendimento = saldo * rendimentoMensal;
        saldo += rendimento;
        System.out.println("Saldo atualizado com sucesso. O novo saldo possuindo rendimento mensal é de: " + rendimento);
    }

    // Implementação dos metodos da Interface


}
