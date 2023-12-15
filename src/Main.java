import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int agency = rand.nextInt(1000, 9999);
        int number = rand.nextInt(1000000, 9999999);

        int agency2 = rand.nextInt(1000, 9999);
        int number2 = rand.nextInt(1000000, 9999999);

        System.out.println("Seja bem-vindo ao ByteBank");
        System.out.println("Para iniciar sua conta, digite o seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Agora digite o seu CPF (sem pontos ou traços): ");
        String cpf = scanner.nextLine();

        System.out.println("Agora didite a sua ocupação: ");
        String occupation = scanner.nextLine();

        Costumer costumer1 = new Costumer(name, cpf, occupation);

        Account account1 = new Account(agency, number, costumer1);
        Account account2 = new Account(agency2, number2, costumer1);

        System.out.println("Cliente cadastrado com sucesso: " + account1.getHolder().getName());

        while(true){
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1- Depositar 2- Sacar 3- Transferir \n4- Verificar saldo 5- verificar informações da conta 6- Sair");
            String option = scanner.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.println ( "Quanto deseja depositar?" );
                    double depositValue = scanner.nextDouble ();
                    account1.deposit ( depositValue );
                }
                case "2" -> {
                    System.out.println ( "Quanto deseja sacar?" );
                    double withdrawValue = scanner.nextDouble ();
                    account1.withdraw ( withdrawValue );
                }
                case "3" -> {
                    System.out.println ( "Quanto deseja transferir?" );
                    double transferValue = scanner.nextDouble ();
                    account1.transfer ( transferValue, account2 );
                }
                case "4" -> System.out.println ( account1.getBalance () );
                case "5" -> System.out.println ( account1 );
                case "6" -> System.exit ( 0 );
                default -> System.out.println ( "Opção inválida" );
            }
        }
    }
}