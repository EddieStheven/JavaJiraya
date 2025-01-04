package Outros.Treino.SalaDeAula.Back;

import java.util.ArrayList;

public class SalaDeAula {

    public ArrayList<Aluno> alunos;

    public SalaDeAula() {
        this.alunos = new ArrayList<>();
    }



    public void adicionarAluno(Aluno aluno, int id) {
        if (aluno.getId() != id) {
            alunos.add(aluno);
            System.out.println("Aluno foi adicionado ao sistema!");
        } else if (aluno.getId() == id) {
            System.out.println("O id dos alunos são iguais");

        }
    }

    public void listarAlunos() {

        if (alunos.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("Tem alunos na lista: ");
            for (Aluno aluno : alunos) {
                System.out.println("Tem um total de: " + aluno);
            }
        }

    }

    public Aluno buscarAlunosPorId(int id) {

        for (Aluno aluno : alunos) {

            if (aluno.getId() == id) {
                return aluno;
            } else {
                System.out.println("Aluno não encontrado!");
            }

        }
        return null;
    }

    public void atualizarNota(int id, double novaNota) {
        Aluno aluno = buscarAlunosPorId(id);

        if (aluno != null) {
            if (novaNota >= 0 && novaNota <= 10) {
                aluno.setNota(novaNota);
                System.out.println("Nota atualizada!");
            } else {
                System.out.println("Erro: nota não pode ser menor que 0 e maior que 10!");
            }
        } else {
            System.out.println("Aluno com id " + id + " não encontrado!");
        }
    }

    public void removerAluno(int id) {
        Aluno aluno = buscarAlunosPorId(id);

        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Alunos com o id de " + id + " não foi encontrado!");
        }
    }
}
