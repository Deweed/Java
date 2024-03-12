public class TestaAluno {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matematica", 60);

        Aluno a1 = new Aluno("Jão do Pé de Feijão", 154, 7.5,
                7, 6.6, 2, 5.7, d1);

        System.out.println("\nSituação do aluno " + a1.nome + " = " + a1.SituacaoAluno() + "\nSua média foi igual a: " +
                a1.CalcularMedia());
        System.out.println("\nDisciplina favorita: " + a1.disciplina.nome +
                "\n e tem uma carga horaria equivalente a: " + a1.disciplina.cargaHoraria);
    }
}

