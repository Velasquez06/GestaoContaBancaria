public abstract class Conta extends SaldoInsuficienteException{
    private int numero;
    private String titular;
    private int saldo;

public Conta(String msg, int numero, String titular, int saldo){
    super(msg);
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
}

    // Métodos da Classe Conta
    public void depositar(){
        double valor;
}

    // Método destinado ao saque com exceção
    public void sacar(int saldo, double valor) throws SaldoInsuficienteException{
        if(valor < saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente!! Valor solicitado: " + valor + " Saldo Disponível: " + saldo);
        }
        double saldorestante = (saldo -= valor);
        System.out.println("O valor atual é: " + saldorestante);
    }

    public abstract double atualizarSaldo();


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
}
