import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupança extends Conta {

    public void imprimeExtrato() {

        System.out.println("### Extrato da conta ###");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaa HH:MM:SS");
            Date date = new Date();

        System.out.println(" Saldo: " + this.getSaldo());
        System.out.println(" Data: " + sdf.format(date));
    }








}
