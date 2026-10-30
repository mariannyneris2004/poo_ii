package br.edu.poo.u2;
public class TarefaNumeros implements Runnable {
 @Override public void run() {
  for(int i=1;i<=10;i++) {
   System.out.println("[Números] " + i);
   if(i<10) try { Thread.sleep(1000); } catch(InterruptedException e) { Thread.currentThread().interrupt(); return; }
  }
 }
}
