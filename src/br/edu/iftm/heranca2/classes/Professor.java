package br.edu.iftm.heranca2.classes;

public class Professor extends Pessoa{
    
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(){
        String identidade =  this.buscarIdentidade();
        this.salario += 600;
        System.out.printf("%s da especialidade %s, recebeu aumento de salario.\n",identidade, this.especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
    
}
