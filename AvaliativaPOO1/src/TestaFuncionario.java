public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Clarin Zé Borracha", 15, 1500.50);
        Gerente g1 = new Gerente("Carolina Beija Fofo", 62, 6500.65, "Desocupada");
        System.out.println(g1);
        System.out.println(f1);
    }
}
