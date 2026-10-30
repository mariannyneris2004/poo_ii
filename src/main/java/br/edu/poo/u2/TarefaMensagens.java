package br.edu.poo.u2;
public class TarefaMensagens implements Runnable {
 @Override public void run() {
  for(int i=1;i<=5;i++) {
   System.out.println("[Mensagens] Executando tarefa concorrente - mensagem " + i);
   if(i<5) try { Thread.sleep(2000); } catch(InterruptedException e) { Thread.currentThread().interrupt(); return; }
  }
 }
}
