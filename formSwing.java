package Ex3Swing;

import java.awt.event.*;
import javax.swing.*;

public class MyFirstSwingForm {

	public static void main(String[] args) {

        JFrame frm = new JFrame("Minha primeira tela Swing");
        
        frm.setVisible(true);
        JLabel lbl = new JLabel("Eita loki!!!");
        frm.add(lbl);
        frm.setSize(350,200);
        
        frm.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
	}

}
