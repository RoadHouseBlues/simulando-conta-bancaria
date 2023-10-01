import java.util.Scanner;

public class ContaTerminal {

        public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String nomeCliente;

        String agencia;

        int numConta;

        double saldo;

        System.out.println("Por favor informe seu nome. " );
        nomeCliente = scan.next();
        
        System.out.println("Por favor informe a Agência. " );
        agencia = scan.next();

        System.out.println("Por favor informe sua conta. " );
        numConta = scan.nextInt();

        System.out.println("Por favor informe seu saldo. " );
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + "Obrigado por criar conta em nosso banco. ");

        System.out.println("Sua agência é " + agencia);

        System.out.println("Sua conta é " + numConta);

        System.out.println("Seu saldo é: " + saldo + "já está disponivel para saque");


        
           
        }
        
    }
    
    
