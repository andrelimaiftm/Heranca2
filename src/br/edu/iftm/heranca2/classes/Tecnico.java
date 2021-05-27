package br.edu.iftm.heranca2.classes;

public class Tecnico extends Aluno{    

    private String registroProfissional;

    public Tecnico(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = null;
    }

    public void praticar(){
        String identidade = this.buscarIdentidade();
        System.out.printf("%s técnico de registro Profissional %s está praticando...\n",identidade,this.registroProfissional);

        
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
