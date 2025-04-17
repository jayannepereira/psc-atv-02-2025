import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int senhaCorreta = 1627;
       boolean acessoPermitido = false;
       
       for(int tentativas = 1; tentativas <= 3; tentativas++){
     
        System.out.println("\nSenha:");
        int senha = scanner.nextInt();
    
        if (senha == senhaCorreta) {
            System.out.println("Senha Correta");
            acessoPermitido = true;
            break;
        } else {
            System.out.println("Senha Incorreta");
        }
       }
       if(!acessoPermitido){
            System.out.println("Quantidade máxima de tentativas excedida. Acesso bloqueado.");
       }
        scanner.close();
    }
}

