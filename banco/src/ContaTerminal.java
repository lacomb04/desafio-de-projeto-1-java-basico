import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       ContaBanco conta = new ContaBanco();

       System.out.println("Por favor digite o seu nome");
       conta.setNomeCliente(scanner.nextLine());

       System.out.println("Por favor digite o numero de sua Conta");
       conta.setNumero(scanner.nextInt());
       scanner.nextLine();

       System.out.println("Por favor digite o numero de sua Agencia");
       conta.setAgencia(scanner.nextLine());

       System.out.println("Por favor digite o numero de seu saldo");
       conta.setSaldo(scanner.nextDouble());
       scanner.close();


        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ",conta "+ conta.getNumero() + " e seu saldo " + conta.getSaldo() +" já está disponível para saque");
       
    }
}
