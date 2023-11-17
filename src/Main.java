public class Main {
  public static void main(String[] args) {
    Telefone t1 = new Telefone();
    Telefone t2 = new Telefone();
    Telefone t3 = new Telefone();
    Telefone t4 = new Telefone();
    t1.setTipo("celular\n");
    t2.setTipo("celular\n");
    t3.setTipo("celular\n");
    t4.setTipo("fixo\n");
    t1.setDdd("61\n");
    t2.setDdd("11\n");
    t3.setDdd("39\n");
    t4.setDdd("62\n");
    t1.setNumero("99497-4453\n");
    t2.setNumero("99046-7543\n");
    t3.setNumero("99236-2565\n");
    t4.setNumero("3829-2212\n");

    Endereco end1 = new Endereco();
    Endereco end2 = new Endereco();
    Endereco end3 = new Endereco();
    end1.setEstado("SC\n");
    end1.setCidade("Florianólis\n");
    end1.setRua("Rua São Jorge\n");
    end2.setEstado("Goias\n");
    end2.setCidade("Rio Verde\n");
    end2.setRua("Rua Uberaba\n");
    end3.setEstado("PE\n");
    end3.setCidade("Porto De Galinhas\n");
    end3.setRua("Avenida Beira Mar\n");

    Aluno a1 = new Aluno();
    Aluno a2 = new Aluno();
    Aluno a3 = new Aluno();
    a1.setNome("Rafael\n");
    a2.setNome("Erick\n");
    a3.setNome("Maria \n");
    a1.setCpf("520.177.600-05\n");
    a2.setCpf("273.802.280-48\n");
    a3.setCpf("396.887.750-02\n");
    a1.setEmail("Rafael@gmail.com\n");
    a2.setEmail("Erick@gmail.com\n");
    a3.setEmail("Maria@gmail.com\n");
    a1.setEndereco(end3);
    a2.setEndereco(end2);
    a3.setEndereco(end3);

    Disciplina d1 = new Disciplina();
    Disciplina d2 = new Disciplina();
    d1.setNome("Estrutura de dados");
    d2.setNome("Laboratório de banco de dados");

    Curso c1 = new Curso();
    Curso c2 = new Curso();
    c1.setNome("Ciência da Computação");
    c2.setNome("Análise De Sistemas");

    Professor prof1 = new Professor();
    Professor prof2 = new Professor();
    Professor prof3 = new Professor();
    prof1.setNome("Diego\n");
    prof1.setTitulacao("Mestre\n");
    prof1.setSalario(7000);
    prof2.setNome("Sebastião\n");
    prof2.setTitulacao("Especialista\n");
    prof2.setSalario(5000);
    prof3.setNome("Fabiano\n");
    prof3.setTitulacao("Especialista\n");
    prof3.setSalario(4500);
    prof1.setCpf("300.933.680-20\n");
    prof2.setCpf("483.842.320-91\n");
    prof3.setCpf("569.173.270-69\n");
    prof1.setEmail("DiegoP@gmail.com\n");
    prof2.setEmail("SebastiãoP@gmail.com\n");
    prof3.setEmail("FabianoP@gmail.com\n");
    prof1.setEndereco(end1);
    prof2.setEndereco(end2);

    d1.addCursos(c1); 
    d1.addCursos(c2);
    d2.addCursos(c1);

    prof1.setDisciplina(d1);
    prof2.setDisciplina(d2);
    prof3.setDisciplina(d2);
    prof1.addTelefone(t1);
    prof1.addTelefone(t4);
    prof2.addTelefone(t2);
    prof3.addTelefone(t3);

    prof1.addCursos(c1);
    prof2.addCursos(c1);
    prof3.addCursos(c1);
    prof2.addCursos(c2);

    a1.setCurso(c1);
    a2.setCurso(c1);
    a3.setCurso(c2);
    a1.setNota(d1, 10);
    a1.setNota(d2, 8.5);
    a2.setNota(d1, 9.4);
    a2.setNota(d2, 4.5);
    a3.setNota(d1, 6);
    a1.addTelefone(t1);
    a1.addTelefone(t2);
    a2.addTelefone(t3);
    a3.addTelefone(t4);

    c1.imprimirCurso();
    c2.imprimirCurso();
  
    a1.imprimir();
    a2.imprimir();
    a3.imprimir();

    prof1.imprimir();
    prof2.imprimir();
    prof3.imprimir();
  }
}