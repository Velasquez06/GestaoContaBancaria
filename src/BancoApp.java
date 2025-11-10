public class BancoApp {
    public static void main(String[] args) {
        try{
            contaCorrente cc = new contaCorrente(1, "Antonio Augusto", 3500);
            contaPoupanca cp = new contaPoupanca(2, "Kimberly ... ", 5500);

            cc.depositar(500);
            cp.atualizarSaldo();

            cc.sacar(300);
            cc.transferir(cp, 200);

            cc.imprimirExtrato();
            cp.imprimirExtrato();

        }catch (SaldoInsuficienteException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}