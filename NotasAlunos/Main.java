import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A classe Main é responsável por ler os dados de alunos de um arquivo de texto,
 * calcular a média das notas e exibir o status de aprovação de cada um.
 * O arquivo de entrada deve ter os dados separados por vírgula no seguinte formato:
 * id,nome,disciplina,notaP1,notaP2
 */
public class Main {
    /**
     * O método principal que inicia a execução do programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        ArrayList<AlunoNota> alunos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            // Lê cada linha do arquivo e cria um objeto AlunoNota
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                if (dados.length >= 5) {
                    AlunoNota aluno = new AlunoNota(
                        Integer.parseInt(dados[0].trim()),
                        dados[1].trim(),
                        dados[2].trim(),
                        Double.parseDouble(dados[3].trim()),
                        Double.parseDouble(dados[4].trim())
                    );
                    alunos.add(aluno);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Itera sobre a lista de alunos para calcular a média e verificar a aprovação
        for (AlunoNota aluno : alunos) {
            double media = (aluno.getP1() + aluno.getP2()) / 2;
            boolean aprovado = media >= 7;

            System.out.println("ID: " + aluno.getIdAluno() +
                               " - Nome: " + aluno.getNome() +
                               " - Disciplina: " + aluno.getDisciplina() +
                               " - Aprovado: " + (aprovado ? "Sim" : "Não"));
        }

        scanner.close();
    }
}