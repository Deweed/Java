public class ContaBancaria {
    int numero;
    String titular;
    float saldo;

    void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Seu deposito foi efetuado no valor de: " + valor);
        }
    }

    void sacar(float valor) {
        if (valor > 0)  {
            saldo -= valor;
            System.out.println("Seu saque foi realizado no valor de: " + valor);
        }

    }

    void conta() {
        System.out.println("\nO titular da conta é  " + titular);
        System.out.println("O número da conta é " + numero);
        System.out.println("O saldo da conta é " + saldo + "\n");
    }

    void exibir() {
        System.out.println("O saldo da conta é " + saldo);
    }

    public ContaBancaria (int num, String Tit, float Val) {
        numero = num;
        titular = Tit;
        saldo = Val;
    }

}
