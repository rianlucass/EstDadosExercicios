package ifma.lista01;

public class TesteAluno {
    public static void main(String[] args) {
        CadastrarAlunos cadastrarAlunos = new CadastrarAlunos(9);

        cadastrarAlunos.adicionarNoInicio("B", "20232ads.cnt0039");
        cadastrarAlunos.adicionarNoFinal("C", "20242ads.cnt0039");
        cadastrarAlunos.adicionarNoFinal("D", "20232adm.cnt0039");
        cadastrarAlunos.adicionarNoFinal("F", "20232ads.cnt0039");
        cadastrarAlunos.adicionarNoInicio("A ", "20242ads.cnt0039");

        cadastrarAlunos.removerComIndice(3);

        cadastrarAlunos.listar();

    }
}
