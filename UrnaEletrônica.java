import java.util.Scanner;
import java.lang.Math;

public class MyClass {
  public static void main(String args[]) {
      
    int Jair = 0;
    int Carlos = 0;
    int Neves = 0;
    int Nulo = 0;
    int Branco = 0;
    int totalVotos = 0;
    int voto = 0;
      
    Scanner scanner = new Scanner(System.in);
      
    String[] votos = {"1. Candidato Jair Rodrigues", "2. Candidato Carlos Luz", "3. Candidato Neves Rocha", "4. Nulo", "5. Branco"};
        System.out.println("==== MENU DE VOTAÇÃO ====");
            for (int i = 0; i < votos.length; i++) {
                System.out.println(votos[i]);
        }

    while(true){
        System.out.println("\nInsira seu voto:");
        voto = scanner.nextInt();
        
         if(voto == 1){
        System.out.println("VOTAÇÃO CONFIRMADA");
        Jair += 1;
        totalVotos++;
    }else if(voto == 2){
        System.out.println("VOTAÇÃO CONFIRMADA");
        Carlos += 1;
        totalVotos++;
    }else if(voto == 3){
        System.out.println("VOTAÇÃO CONFIRMADA");
        Neves += 1;
        totalVotos++;
    }else if(voto == 4){
        System.out.println("VOTAÇÃO CONFIRMADA");
        Nulo += 1;
        totalVotos++;
    }else if(voto == 5){
        System.out.println("VOTAÇÃO CONFIRMADA");
        Branco += 1;
        totalVotos++;
    }else if(voto > 6 || voto < 1){
        System.out.println("OPÇÃO INVÁLIDA");
        System.out.println("Insira novamente o voto desejado.");
    }else{
        System.out.println("VOTAÇÃO ENCERRADA");
        System.out.println("\na) Resultado da votação:");
        System.out.println("1. Candidato Jair Rodrigues = " + Jair + " votos.");
        System.out.println("2. Candidato Carlos Luz = " + Carlos + " votos.");
        System.out.println("3. Candidato Neves Rocha = " + Neves + " votos.");
        System.out.println("4. Nulo = " + Nulo + " votos.");
        System.out.println("5. Branco = " + Branco + " votos.");
        
        double porcNulo = (Nulo * 100.0) / totalVotos;
        System.out.println("\nb) Porcentagem de votos nulos: " + porcNulo);
        
        double porcBranco = (Branco * 100.0) / totalVotos;
        System.out.println("\nc) Porcentagem de votos brancos: " + porcBranco);
        
        int vencedor = Math.max(Math.max(Jair,Carlos),Neves);
            if (Jair == Carlos && Jair == Neves) {
                System.out.println("\nd) Empate entre os três candidatos.");
            } else if (Jair == Carlos && Jair > Neves) {
                System.out.println("\nd) Empate entre Jair e Carlos.");
            } else if (Jair == Neves && Jair > Carlos) {
                System.out.println("\nd) Empate entre Jair e Neves.");
            } else if (Carlos == Neves && Carlos > Jair) {
                System.out.println("\nd) Empate entre Carlos e Neves.");
            } else if (vencedor == Jair) {
                System.out.println("\nd) O candidato vencedor é o Jair Rodrigues");
            } else if (vencedor == Carlos) {
                System.out.println("\nd) O candidato vencedor é o Carlos Luz");
            } else if (vencedor == Neves) {
                System.out.println("\nd) O candidato vencedor é o Neves Rocha");
            }
            scanner.close(); 
            break;
        }
    }
 }
}