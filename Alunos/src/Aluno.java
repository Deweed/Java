public class Aluno {
    String nome;
    int matricula;
    double nota_math;
    double nota_port;
    double nota_fis;
    double nota_geo;
    double nota_qui;
    Disciplina disciplina;

    public Aluno(String nome, int matricula, double nota_math, double nota_port,
                 double nota_fis, double nota_geo, double nota_qui, Disciplina disciplina) {

        this.nome = nome;
        this.matricula = matricula;
        this.nota_math = nota_math;
        this.nota_port = nota_port;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_qui = nota_qui;
        this.disciplina = disciplina;
    }

    double CalcularMedia () {
        return (nota_geo + nota_port + nota_math + nota_fis + nota_qui) / 5;
    }

    String SituacaoAluno() {
        String situacao; //aprovado ou reprovado

        if (CalcularMedia() >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        return situacao;
    }


}
