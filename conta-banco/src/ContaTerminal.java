import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        contaBancaria contabancaria = new contaBancaria();

        //TODO: COnhecer e importar a classe Scanner
        
        Scanner scan = new Scanner(System.in);

        //Exibir as mesagens para nosso usuario
        //obter pelo scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da conta !");
        contabancaria.setNumero(scan.nextInt());
        System.out.println("Por favor, digite o número da Agência !");
        contabancaria.setAgencia(scan.next());
        System.out.println("Por favor, digite seu nome !");
        contabancaria.setNomeCliente(scan.next());
        System.out.println("Por favor, digite seu saldo !");
        contabancaria.setSaldo(scan.nextDouble());
        

        //Exibir a mensagem conta criada
        System.out.println("Olá " + contabancaria.getNomeCliente() + 
                           ", obrigado por criar uma conta em nosso banco, sua agência é " +
                            contabancaria.getAgencia() +
                           ", conta " +  contabancaria.getNumero() + " e seu saldo " + 
                            contabancaria.getSaldo() + " já está disponível para saque");
                            
    }
}
