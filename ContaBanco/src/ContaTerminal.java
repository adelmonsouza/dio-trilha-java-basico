import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Instancia a classe Scanner para leitura dos dados via terminal
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Limpa o buffer do scanner
        scanner.nextLine();
        
        // Solicita a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        // Solicita o saldo
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();
        
        // Exibe a mensagem formatada com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fecha o scanner
        scanner.close();
    }
}
