public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    
        //metodo construtor da superclasse
        public Cliente(String nome, String cpf, String telefone){
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            
        }
        
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return String.format("Dados: \n "
                +"\nNome: "+nome
                +"\ncpf: "+cpf
                +"\ntelefone: "+telefone);
    }
}
