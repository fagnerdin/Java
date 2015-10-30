package ex2Container;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


public class TesteContainers {

    /**
   * @param args
   */
    public static void main(String[] args) {
        
        JFrame frm = new JFrame("Teste de containers");

        // Ajusta posição e tamanho da janela principal
        frm.setBounds(25, 100, 400, 150); 
        
        // Cria botao padrao de fechar janela
        frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        // Define o layout do container (frm)
        FlowLayout flow = new FlowLayout(); 
        
        // Define o tamanho
        Container container = frm.getContentPane();
        
        // Ajusta layout do container
        container.setLayout(flow);
        
        // Adiciona 4 botões
        for (int i=1; i<=4; i++)
            container.add(new JButton("Aperte " + i)); 
        
        // Exibe a janela
        frm.setVisible(true); 
    }
}
