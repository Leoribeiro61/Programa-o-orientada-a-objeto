public class Fornecedor extends Pessoa {
    private double ValorCredito;
    private double ValorDivida;

    public double getValorCredito() {
        return ValorCredito;
    }

    public void setValorCredito(double ValorCredito) {
        this.ValorCredito = ValorCredito;
    }

    public double getValorDivida() {
        return ValorDivida;
    }

    public void setValorDivida(double ValorDivida) {
        this.ValorDivida = ValorDivida;
    }
    public double obterSaldo(){
        double saldo = getValorCredito()- getValorDivida();
        return saldo;
    }

    
    @Override
    public String toString(){
        return String.format(""+super.toString(),
                                "\nCredito: "+getValorCredito()+
                                "\nValorDivida: "+getValorDivida()+
                                "\nSaldo: "+obterSaldo());
    }
}
