package br.edu.poo.u3;
public class DemonstracaoSingleton {
 public static void executar() {
  ConfiguracaoSingleton singleton1 = ConfiguracaoSingleton.getInstance();
  ConfiguracaoSingleton singleton2 = ConfiguracaoSingleton.getInstance();
  System.out.println("singleton1 == singleton2: " + (singleton1 == singleton2));
  singleton1.setNomeAplicacao("Aplicação compartilhada");
  System.out.println("Configuração vista por singleton2: " + singleton2.getNomeAplicacao());
 }
 public static void main(String[] args) { executar(); }
}
