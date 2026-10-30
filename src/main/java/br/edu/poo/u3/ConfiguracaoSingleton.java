package br.edu.poo.u3;
public final class ConfiguracaoSingleton {
 private static ConfiguracaoSingleton instancia;
 private String nomeAplicacao = "Sistema acadêmico POO II";
 private ConfiguracaoSingleton() { System.out.println("Instância Singleton criada!"); }
 public static synchronized ConfiguracaoSingleton getInstance() {
  if(instancia == null) instancia = new ConfiguracaoSingleton();
  return instancia;
 }
 public String getNomeAplicacao() { return nomeAplicacao; }
 public void setNomeAplicacao(String nome) { nomeAplicacao = nome; }
}
