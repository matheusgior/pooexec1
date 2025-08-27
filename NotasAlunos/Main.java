import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();
        
        ArrayList<AlunoNota> alunos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                // Certifique-se de que a linha tem dados suficientes
                if (dados.length >= 5) {
                    AlunoNota aluno = new AlunoNota(
                        Integer.parseInt(dados[0].trim()),
                        dados[1].trim(),
                        dados[2].trim(),
                        Double.parseDouble(dados[3].trim()),
                        Double.parseDouble(dados[4].trim()), 0
                    );
                    alunos.add(aluno);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            
            return;
        }

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