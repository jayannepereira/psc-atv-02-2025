import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite um número: ");
       int num = scanner.nextInt();
       
       if(num <= 1){
           System.out.println(num + " não é um número primo.");
       }else{
           boolean primo = true;
           for (int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    primo = false;
                    break;
                    }
                }if (primo) {
                    System.out.println(num + " é um número primo.");
                } else {
                    System.out.println(num + " não é um número primo.");
                }
       }
       scanner.close();
    }
}

