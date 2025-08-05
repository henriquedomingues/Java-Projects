package model;

public class Aluno {

   private String nome;
   private String RA;
   private int idade;


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRA() {
        return RA;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", RA: " + RA + ", Idade: " + idade;
    }

}
