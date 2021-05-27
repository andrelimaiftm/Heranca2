package br.edu.iftm.heranca2.classes;

public class Bolsista extends Aluno{
    
    private double bolsa;

    public Bolsista(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = 300.0;
    }

    public void renovarBolsa(){
        String identidade = this.buscarIdentidade();
        System.out.printf("%s que cursa %s teve a sua bolsa renova por mais 6 meses.\n",identidade, this.curso);
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }   

}
