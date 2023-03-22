import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scanner =new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta.");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia.");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome.");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo inicial.");
        saldo = Float.parseFloat(scanner.next());

        System.out.print("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

