public abstract class Conta implements OperacoesBancarias{
    private int numero;
    private String titular;
    protected int saldo;

    public Conta(int numero, String titular, int saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Métodos da Classe Conta
    public void depositar(double valor){
        if (valor > 0){
            System.out.println("\n Depósito de R$ " + valor + " realizado com sucesso.\n Realizado por: " + titular);
        }else{
            System.out.println("\n Valor insuficiente para depósito");
        }
    }

    // Metodo destinado ao saque com exceção
    public void sacar(int valor) throws SaldoInsuficienteException{
        if(valor <= 0){
            System.out.println("\n Não é possível sacar esse valor");
            return;
        }
        if (saldo < valor){
            throw new SaldoInsuficienteException("\n Saldo insuficiente para realizar operação. Valor Solicitado: " + valor);
        }

        saldo -= valor;
        System.out.println("\n Saque de R$" + valor + " realizado com sucesso\n Realizado por: " + titular);
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    // Metodos para implementação nas subclasses
    public abstract void atualizarSaldo();
}


