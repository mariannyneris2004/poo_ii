package br.edu.poo.u1;
import javax.swing.*;
import java.awt.*;
public class InterfaceGrafica extends JFrame {
 public InterfaceGrafica() {
  super("U1 - Interface gráfica Swing");
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  setSize(400, 200);
  setLayout(new FlowLayout(FlowLayout.LEFT, 3, 20));
  JComboBox<String> opcoes = new JComboBox<>(new String[]{"Opção 1", "Opção 2", "Opção 3"});
  JCheckBox marcar = new JCheckBox("Ativo", false);
  JTextField campo = new JTextField(6);
  JButton salvar = new JButton("Salvar");
  JButton sair = new JButton("Sair");
  // Intencionalmente sem ActionListener, conforme o roteiro.
  add(opcoes); add(marcar); add(campo); add(salvar); add(sair);
  setLocationRelativeTo(null);
 }
 public static void abrir() { SwingUtilities.invokeLater(() -> new InterfaceGrafica().setVisible(true)); }
 public static void main(String[] args) { abrir(); }
}
