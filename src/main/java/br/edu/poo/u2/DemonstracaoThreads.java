package br.edu.poo.u2;
public class DemonstracaoThreads {
 public static void executar() {
  Thread numeros = new Thread(new TarefaNumeros(), "thread-numeros");
  Thread mensagens = new Thread(new TarefaMensagens(), "thread-mensagens");
  numeros.start(); mensagens.start();
  try { numeros.join(); mensagens.join(); System.out.println("As duas threads terminaram."); }
  catch(InterruptedException e) { numeros.interrupt(); mensagens.interrupt(); Thread.currentThread().interrupt(); }
 }
 public static void main(String[] args) { executar(); }
}
