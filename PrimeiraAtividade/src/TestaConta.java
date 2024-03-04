public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(17, "Marcin bala torta", 1550.00f);
        ContaBancaria c2 = new ContaBancaria(18, "Jorgin Bala Pura", 655.98f);

        //c1.numero = 1234;
        //c1.titular = "Newton Paiva";
        //c1.saldo = 256.54f;
        //c2.numero = 4321;
        //c2.titular = "Paiva Newton";
        //c2.saldo = 456.52f;

        c1.conta();
        c1.depositar( 900);
        c1.exibir();
        c1.sacar(500);
        c1.exibir();

        c2.conta();
        c2.depositar( 850);
        c2.exibir();
        c2.sacar(500);
        c2.exibir();
    }
}