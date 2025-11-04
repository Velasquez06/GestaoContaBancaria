public class BancoApp {
    public static void Main(String [] args){

    contaCorrente cc = new contaCorrente();
    cc.numero = 1234;
    cc.titular = "Antônio Augusto";
    cc.saldo = 15000;

    contaPoupanca cp = new contaPoupanca();
    cp.numero = 4321;
    cp.titular = "Kimberly Silva";
    cp.saldo = 20000;

        System.out.println("Antônio Augusto transferiu ");

    }
}