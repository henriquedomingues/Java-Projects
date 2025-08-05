import model.Aluno;
import service.AlunoService;
import model.Aluno;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoService service = new AlunoService();
        int opcao;
        int opcaodois;
        String nomeDigitado;
        String buscarAlunoNome;
        String buscarAlunoRA;

        do {
            System.out.println("------BEM VINDO AO CADRASTO DE ALUNOS-----");
            System.out.println("Digite uma das opções abaixo: ");
            System.out.println("1 - Adicionar aluno.");
            System.out.println("2 - Listar alunos.");
            System.out.println("3 - Buscar aluno.");
            System.out.println("4 - Remover aluno.");
            System.out.println("0 - Sair.");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Aluno novoAluno = new Aluno();
                    System.out.println("Digite o nome do aluno: ");
                    novoAluno.setNome(scanner.nextLine());
                    System.out.println("Digite o RA do Aluno");
                    novoAluno.setRA(scanner.nextLine());
                    System.out.println("Digite a Idade do Aluno");
                    novoAluno.setIdade(scanner.nextInt());
                    System.out.println();
                    System.out.println("Aluno cadrastrado com sucesso!");
                    System.out.println();
                    service.adicionarAluno(novoAluno);
                break;

                case 2:
                    service.listarAlunos();
                break;

                case 3:
                    System.out.println("Escolha a forma de busca de alunos:");
                    System.out.println("1 - Buscar pelo nome");
                    System.out.println("2 - Buscar pelo RA");
                    System.out.println("Digite a opção: ");
                    opcaodois = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaodois == 1) {
                        System.out.println("Digite o nome do aluno que você deseja buscar:");
                        buscarAlunoNome = scanner.nextLine();
                        Aluno resultado = service.buscarAlunoPorNome(buscarAlunoNome);
                        if (resultado != null) {
                            System.out.println();
                            System.out.println("Aluno encontrado: " + resultado);
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("Aluno não encontrado.");
                            System.out.println();
                        }
                    }
                    if (opcaodois == 2){
                        System.out.println("Digite o RA do aluno que você deseja buscar: ");
                        buscarAlunoRA = scanner.nextLine();
                        Aluno resultadodois = service.buscarAlunoPorRA(buscarAlunoRA);
                        if (resultadodois != null){
                            System.out.println();
                            System.out.println("Aluno encontrado: " + resultadodois);
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("Aluno não econtrado.");
                            System.out.println();
                        }
                    }
                break;

                case 4:
                    System.out.println("Digite o RA do aluno que você que Excluir: ");
                    String removerAluno = scanner.nextLine();
                    Boolean resul = service.removerAluno(removerAluno);
                    if (resul){
                        System.out.println();
                        System.out.println("Aluno removido com sucesso!");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Falha ao remover o aluno!");
                        System.out.println();
                    }
                break;
            }
        } while (opcao != 0);
        scanner.close();


    }
}