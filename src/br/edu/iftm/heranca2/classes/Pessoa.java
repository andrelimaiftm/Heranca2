package br.edu.iftm.heranca2.classes;

public class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    protected String buscarIdentidade(){
        String identidade = "";
        if(this.sexo == 'M' || this.sexo == 'm'){
            identidade = "O " + this.nome;
        }else if(this.sexo == 'F' || this.sexo == 'f'){
            identidade = "A "+ this.nome;
        }
        return identidade;
    }

    public void fazerAniversario(){
        String identidade = this.buscarIdentidade();
        System.out.printf("%s está fazendo Aniversario. Parabéns!!!\n", identidade);
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    
}
