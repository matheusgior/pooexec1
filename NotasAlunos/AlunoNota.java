public class AlunoNota {
    private int idAluno;
    private String nome;
    private String disciplina;
    private double p1;
    private double p2;
    private int faltas;

    public AlunoNota(int idAluno, String nome, String disciplina, double p1, double p2, int faltas) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.disciplina = disciplina;
        this.p1 = p1;
        this.p2 = p2;
        this.faltas = faltas;
    }

    public int getIdAluno() { return idAluno; }
    public String getNome() { return nome; }
    public String getDisciplina() { return disciplina; }
    public double getP1() { return p1; }
    public double getP2() { return p2; }
    public int getFaltas() { return faltas; }

    @Override
    public String toString() {
        return idAluno + " - " + nome + " - " + disciplina + " - P1: " + p1 + " - P2: " + p2 + " - Faltas: " + faltas;
    }
}