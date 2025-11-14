public class BancoApp {
    public static void main(String[] args) {
        try{
            contaCorrente cc = new contaCorrente(1, "Antonio Augusto da Silva", 1500);
            contaPoupanca cp = new contaPoupanca(2, "Kimberly da Silva ", 1000);

            cc.depositar(500);
            cp.atualizarSaldo();

            cc.sacar(500);
            cc.transferir(cp, 100);

            cc.imprimirExtrato();
            cp.imprimirExtrato();

        }catch (SaldoInsuficienteException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}