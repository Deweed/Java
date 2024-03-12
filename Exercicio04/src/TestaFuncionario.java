public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.nome = "Alonso";
        f2.nome = "Fittipaldi";
        f3.nome = "Gabriele Mini";

        f1.salario = 3000;
        f2.salario = 2000;
        f3.salario = 1000;

        f1.setIdade(89);
        f2.setIdade(20);
        f3.setIdade(16);

        System.out.printf("\nSalário do %s [%d]: %.2f", f1.nome, f1.getIdade(), f1.salario);
        System.out.printf("\nSalário do %s [%d]: %.2f", f2.nome, f2.getIdade(), f2.salario);
        System.out.printf("\nSalário do %s [%d]: %.2f", f3.nome, f3.getIdade(), f3.salario);
    }
}