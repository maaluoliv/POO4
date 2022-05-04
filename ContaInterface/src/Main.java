public class Main {
    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupança cp = new ContaPoupança();
        cp.depositar(500.20);
        cp.sacar(25);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);


    }
}