package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class LAFExemplo {
    public static void main(String[] args) {
    	try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            // LAF Windows não encontrado, usar o LAF padrão do sistema
        }
        
        // Define o ícone personalizado
        ImageIcon icon = new ImageIcon("caminho/para/o/arquivo/imagem.png");
        
        // Exibe a caixa de diálogo personalizada
        int resposta = JOptionPane.showOptionDialog(
                null, "Você gostaria de continuar?", "Título da janela",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, null, null);
        
        // Verifica a resposta do usuário
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "O usuário clicou em Sim.");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "O usuário clicou em Não.");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "O usuário fechou a janela.");
        }
    }
}

