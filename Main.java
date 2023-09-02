
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        /*
        //Cadastro do objeto cadastro com o construtor padrão
        Cadastro carro = new Cadastro("123", "JJJ1234", "preto",
                "gol", 2010);

        Cadastro carro2 = new Cadastro("456", "KKK4321", "vermelho",
                "golf", 2013);
        Cadastro carro3 = new Cadastro( 2023);

        System.out.println("Carro 1: "+carro.cor);
        System.out.println("Carro 2: "+carro2.cor);
        
        carro3.modelo = "vectra";
        
        System.out.println("Carro 3: " +carro3.modelo+
                                     "\nAno:"+carro3.ano);

*/
        
        String chassi;
        String placa;
        String modelo;
        String cor;
        int ano;
        
        chassi = JOptionPane.showInputDialog("Digite o chassi:");
        placa = JOptionPane.showInputDialog("Digite a placa:");
        modelo = JOptionPane.showInputDialog("Digite o modelo:");
        cor = JOptionPane.showInputDialog("Digite a cor:");
        ano = Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano:"));
        
        Cadastro carro = new Cadastro(chassi, placa, modelo, cor, ano);
        
        System.out.println("Dados: \n Chassi: "+carro.chassi
                                    +"\n Placa: "+carro.placa
                                    +"\n Modelo: "+carro.modelo
                                    +"\n cor:" +carro.cor
                                    +"\n ano:" +carro.ano);
    }
}