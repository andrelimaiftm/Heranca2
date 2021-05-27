package br.edu.iftm.heranca2.testes;

import br.edu.iftm.heranca2.classes.*;

public class PessoalPrincipal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 45, 'M');
        Pessoa p2 = new Pessoa("", 0, ' ');
        Visitante v1 = new Visitante("Victor", 17, 'm');
        Aluno a1 =  new Aluno("Julia", 22, 'F', "23456", "Ciência da Computação");
        Professor prof1 = new Professor("Andre", 35, 'M', "Desenvolvedor Java", 1600.0);
        Bolsista b1 = new Bolsista("Ana", 25, 'F', "42367", "Enfermagem");
        Tecnico t1 = new Tecnico("Pedro", 27, 'M', "43578", "Ciência da Computação");

        p2.setNome("Maria");
        p2.setIdade(21);
        p2.setSexo('f');

        p1.fazerAniversario();
        p2.fazerAniversario();

        v1.fazerAniversario();

        a1.fazerAniversario();
        a1.pagarMensalidade();

        System.out.println(prof1.getSalario());
        prof1.receberAumento();
        System.out.println(prof1.getSalario());

        b1.pagarMensalidade();
        b1.renovarBolsa();

        t1.setRegistroProfissional("reg45678");
        t1.pagarMensalidade();
        t1.praticar();


    }
    
}
