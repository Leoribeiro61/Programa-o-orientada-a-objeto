
public class Conta extends Cliente{
    
    private String conta;
    private String agencia;
    
    public Conta(String nome, String cpf, String telefone, String conta, String agencia){
        super(nome, cpf, telefone);
        this.conta = conta;
        this.agencia = agencia;
        
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    @Override
    public String toString(){
        return String.format(" "+super.toString()
                                +"\nAgencia: "+getAgencia()
                                +"\nConta: "+getConta());
    }
}
