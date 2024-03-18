public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Cleitin Bala quente", 16, "25648");

        System.out.println("\nAluno: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());

        a1.setNome("xXMarquinRDXx");
        a1.setIdade(69);
        a1.setMatricula("6969");

        System.out.println("\nAluno: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matricula: " + a1.getMatricula());

    }
}
