import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome completo:");
        String nomeCompleto = scanner.nextLine();

                System.out.println("Digite aqui a sua agência:");
        String numeroAgencia = scanner.nextLine();


        System.out.println("Digite os quatro números da sua conta: ");
        int numeroConta = scanner.nextInt();


        double saldoDisponivel = 1400;



        System.out.println("Olá seja bem vindo: " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é : " + numeroAgencia + ", conta : " + numeroConta + " e seu saldo " + saldoDisponivel + " ja está disponível para saque");
        
    }
}