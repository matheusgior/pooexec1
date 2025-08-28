/**
 * A classe AlunoNota representa um registro de aluno com informações de notas e faltas.
 * Ela armazena dados como ID, nome, disciplina e notas das provas (P1 e P2).
 */
public class AlunoNota {
    private int idAluno;
    private String nome;
    private String disciplina;
    private double p1;
    private double p2;

    /**
     * @param idAluno    O ID único do aluno.
     * @param nome       O nome completo do aluno.
     * @param disciplina O nome da disciplina.
     * @param p1         A nota da primeira prova.
     * @param p2         A nota da segunda prova.
     */
    public AlunoNota(int idAluno, String nome, String disciplina, double p1, double p2) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.disciplina = disciplina;
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * @return O ID do aluno.
     */
    public int getIdAluno() { return idAluno; }

    /**
     * @return O nome do aluno.
     */
    public String getNome() { return nome; }

    /**
     * @return O nome da disciplina.
     */
    public String getDisciplina() { return disciplina; }

    /**
     * @return A nota da P1.
     */
    public double getP1() { return p1; }

    /**
     * @return A nota da P2.
     */
    public double getP2() { return p2; }

    /**
     * @return Uma string formatada com os dados do aluno.
     */
    @Override
    public String toString() {
        return idAluno + " - " + nome + " - " + disciplina + " - P1: " + p1 + " - P2: " + p2;
    }
}