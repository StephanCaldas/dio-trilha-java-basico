import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String agencia = (String) "";
        int numero = (int) 0;
        String nomeCliente = (String) "";
        float saldo = (float) 0.0;

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário
        System.out.println("======================================================================");
        System.out.println("============================= BANCO JAVA =============================");
        System.out.println("======================================================================");

        //TODO: Obter pela Scanner os valores digitados no terminal
        System.out.print("Por favor, agora digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("Muito Bem! Agora digite seu saldo: ");
        saldo = scanner.nextFloat();

        //TODO: Exibir a mensagem conta criada
        System.out.println();
        System.out.println("======================================================================");

        System.out.printf("Olá %s,\n", nomeCliente);
        System.out.printf("Obrigado por criar uma conta em nosso banco,\n");
        System.out.printf("Sua agência é %s,\n", agencia);
        System.out.printf("Conta %d e seu saldo %.2f já está disponível para saque.\n", numero, saldo);
        System.out.println("======================================================================");
    }
}
