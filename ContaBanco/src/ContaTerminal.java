import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da sua agencia: ");
        String agencia = scanner.next();

        System.err.println("Digite o seu saldo para saque: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$"+saldo + " já está disponível para saque");

    }
}
