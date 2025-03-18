import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Prezado cliente, seja bem vindo ao nosso banco! ");
        System.out.println();
        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o número da agencia: ");
        String agencia = sc.next();
        System.out.print("Informe o seu nome: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        System.out.print("Informe um valor para inicializar sua conta: ");
        double saldo = sc.nextDouble();
        System.out.println();

        Usuario usuario = new Usuario(numero, agencia, nomeCliente, saldo);

        System.out.println(usuario);
        

        sc.close();

    }
}
