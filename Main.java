
public class Main {

    public static void main(String[] args) {
        
        Conta c1 = new Conta("pedro", "123", "456", "001", "23456-0");
        
        System.out.println("Impressao: "+c1.toString());
        
        Cliente cliente = new Cliente("Maria", "678", "444");
        
        System.out.println("Cliente "+cliente.toString());
    }
    
}
