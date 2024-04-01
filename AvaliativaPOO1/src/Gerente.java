public class Gerente extends Funcionario {

    String departamento;

    public Gerente (String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return "\n---- Gerente ----" +
                "\nDepartamento: " + departamento +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSalario: " + String.format("%.2f", salario);

    }
}
