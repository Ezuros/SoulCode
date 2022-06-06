package Funcionario;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private String situacao;

    public Funcionario(String nome, int idade, String cargo, String situacao){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void demitirFuncionario(){
        this.situacao = "Inativo";
    }

    public void trocarCargoFuncionario(String cargo){
        this.cargo = cargo;
    }

    public void pagarSalario(){
        System.out.println("Salário de " + this.nome + " efetuado com sucesso");
    }

    public void fazerAniversario(){
        this.idade = this.idade + 1;
    }

}
