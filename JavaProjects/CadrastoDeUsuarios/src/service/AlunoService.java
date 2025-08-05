package service;
import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }


    public void listarAlunos(){

        if (alunos.isEmpty()){
            System.out.println();
            System.out.println("Nenhum aluno cadrastado");
            System.out.println();
        } else {
            for (int i = 0; i < alunos.size(); i++){
                Aluno a = alunos.get(i);
                System.out.println();
                System.out.println("Aluno "+ (i + 1) + " " + a);
                System.out.println();

            }

        }

    }

    public Aluno buscarAlunoPorNome(String nome){
        for (Aluno aluno : alunos){
            if (aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            }
        }
        return null;
    }

    public Aluno buscarAlunoPorRA(String RA){
        for (Aluno aluno : alunos){
            if (aluno.getRA().equalsIgnoreCase(RA)){
                return aluno;
            }
        }
        return null;
    }

    public boolean removerAluno(String RA){
        for (Aluno aluno : alunos){
            if (aluno.getRA().equalsIgnoreCase(RA)) {
                alunos.remove(aluno);
                return true;
            }
        }
        return false;
    }
}
