package br.edu.iftm.heranca2.classes;

public class Aluno extends Pessoa{
    
    protected String matricula;
    protected String curso;

    public Aluno(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;        
    }

    public void pagarMensalidade(){
        String identidade = this.buscarIdentidade();
        System.out.printf("%s realizou o pagamento da mensalidade do curso %s.\n", identidade, this.curso);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }    
    
}
