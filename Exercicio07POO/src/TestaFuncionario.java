public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioRegular regular1 = new FuncionarioRegular("João", 20.0, 160);
        FuncionarioRegular regular2 = new FuncionarioRegular("Maria", 25.0, 180);

        FuncionarioTerceirizado terceirizado1 = new FuncionarioTerceirizado("Carlos", 18.0, 150, 500.0);
        FuncionarioTerceirizado terceirizado2 = new FuncionarioTerceirizado("Ana", 22.0, 170, 600.0);

        System.out.println("Salário mensal de " + regular1.getNome() + ": R$" + regular1.calcularSalarioMensal());
        System.out.println("Salário mensal de " + regular2.getNome() + ": R$" + regular2.calcularSalarioMensal());
        System.out.println("Salário mensal de " + terceirizado1.getNome() + ": R$" + terceirizado1.calcularSalarioMensal());
        System.out.println("Salário mensal de " + terceirizado2.getNome() + ": R$" + terceirizado2.calcularSalarioMensal());
    }
}