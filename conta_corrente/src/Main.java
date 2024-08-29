import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Crie sua conta---------");
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite qual valor do seu primeiro depósito");
        double saldo = scanner.nextDouble();

        String dados = """
                  Informações do cliente
                --------------------------------
                Nome: %s
                Tipo de conta: corrente
                Saldo:R$ %.2f
                --------------------------------
                
                """.formatted(nome,saldo);

        System.out.println(dados);

        int escolha = 0;
        double deposito = 0;
        double saque= 0;

        while(escolha != 4){
            System.out.println("---------Menu---------");
            System.out.println("1. Vizualizar saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println(String.format("O saldo atual é de R$ %.2f",saldo));
            }else if(escolha == 2){
                System.out.println("Digite o valor que você quer sacar ");
                saque = scanner.nextDouble();
                if(saque > saldo){
                    System.out.println("Você não pode sacar mais dinheiro do que tem!");
                }else{
                saldo -= saque;
                System.out.println(String.format("Você sacou R$ %.2f",saque));
                System.out.println(String.format("Seu saldo foi atualizado para R$ %.2f",saldo));
                }
            }else if(escolha == 3){
                System.out.println("Digite o valor que você quer depositar ");
                deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println(String.format("Você sacou R$ %.2f",deposito));
                System.out.println(String.format("Seu saldo foi atualizado para R$ %.2f",saldo));
            }else if(escolha == 4){
                System.out.println("Você saiu da sua conta");
            }else{
                System.out.println("Opção inválida");
            }



        }


    }
}