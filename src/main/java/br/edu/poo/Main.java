package br.edu.poo;
import br.edu.poo.u1.InterfaceGrafica;
import br.edu.poo.u2.DemonstracaoThreads;
import br.edu.poo.u3.DemonstracaoSingleton;
import br.edu.poo.u4.ConsultaMysql;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  try (Scanner scanner = new Scanner(System.in)) {
   while(true) {
    System.out.println("\n=== POO II | Quatro atividades ===");
    System.out.println("1 - U1: Interface Swing\n2 - U2: Threads\n3 - U3: Singleton\n4 - U4: MySQL/JDBC\n0 - Encerrar");
    System.out.print("Escolha: ");
    String escolha = scanner.nextLine().trim();
    switch(escolha) {
     case "1" -> InterfaceGrafica.abrir();
     case "2" -> DemonstracaoThreads.executar();
     case "3" -> DemonstracaoSingleton.executar();
     case "4" -> ConsultaMysql.executar();
     case "0" -> {return;}
     default -> System.out.println("Opção inválida.");
    }
   }
  }
 }
}
