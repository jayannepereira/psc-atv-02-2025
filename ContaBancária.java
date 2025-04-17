import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       float saldo = 0;
       System.out.println("Saldo: " + saldo);
       
       System.out.println("\nOPÇÕES:" + "\n(a) consultar saldo" + "\n(b) saque" + "\n(c) depósito" + "\n(d) sair\n");

       String opcao = "";
       while (!opcao.equals("d")){
           opcao = scanner.next();
       
       if(opcao.equals("a")){
           System.out.println("O saldo atual é de R$ " + saldo + "\n");
           System.out.println("\nOPÇÕES:" + "\n(a) consultar saldo" + "\n(b) saque" + "\n(c) depósito" + "\n(d) sair\n");
       }else if(opcao.equals("b")){
           System.out.println("Qual valor a sacar?");
           float saque = scanner.nextFloat();
           if (saque > saldo) {
                System.out.println("Saldo insuficiente para saque.\n");
                System.out.println("\nOPÇÕES:" + "\n(a) consultar saldo" + "\n(b) saque" + "\n(c) depósito" + "\n(d) sair\n");
           } else {
           saldo -= saque;
           System.out.println("Saldo: " + saldo + "\n");
           System.out.println("\nOPÇÕES:" + "\n(a) consultar saldo" + "\n(b) saque" + "\n(c) depósito" + "\n(d) sair\n");
           }
       }else if(opcao.equals("c")){
           System.out.println("Qual valor para depósito?");
           float deposito = scanner.nextFloat();
           saldo += deposito;
           System.out.println("Saldo: " + saldo + "\n");
           System.out.println("\nOPÇÕES:" + "\n(a) consultar saldo" + "\n(b) saque" + "\n(c) depósito" + "\n(d) sair\n");
       }else if(opcao.equals("d")){
           System.out.println("Usuário deslogado.");
           break;
       }else{
           System.out.println("Selecione uma opção de menu válida.\n");
           System.out.println("\nOPÇÕES:" + "\n(a) consultar saldo" + "\n(b) saque" + "\n(c) depósito" + "\n(d) sair\n");
       }
       }
       scanner.close();
    }
}

