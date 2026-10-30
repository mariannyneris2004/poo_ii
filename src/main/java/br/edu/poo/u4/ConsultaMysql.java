package br.edu.poo.u4;
import java.sql.*;
public class ConsultaMysql {
 public static void executar() {
  String url = System.getenv().getOrDefault("DB_URL", "jdbc:mysql://localhost:3306/poo_ii?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
  String usuario = System.getenv().getOrDefault("DB_USER", "root");
  String senha = System.getenv().getOrDefault("DB_PASSWORD", "");
  String sql = "SELECT id, nome, email FROM alunos ORDER BY id";
  try(Connection conexao = DriverManager.getConnection(url, usuario, senha);
      PreparedStatement statement = conexao.prepareStatement(sql);
      ResultSet resultado = statement.executeQuery()) {
   System.out.println("Conexão bem-sucedida com o banco de dados MySQL.");
   System.out.println("Consulta SELECT executada corretamente.\nResultados da consulta:");
   while(resultado.next()) System.out.printf("ID: %d, Nome: %s, Email: %s%n", resultado.getInt("id"), resultado.getString("nome"), resultado.getString("email"));
  } catch(SQLException e) {
   System.err.println("Falha ao conectar/consultar MySQL: " + e.getMessage());
   System.err.println("Confira se o MySQL está ativo, execute sql/criar_banco.sql e configure DB_URL, DB_USER e DB_PASSWORD.");
  }
 }
 public static void main(String[] args) { executar(); }
}
