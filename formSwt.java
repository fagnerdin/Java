package modulo1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class MyFirstSwtForm {

    /**
   * @param args
   */
    public static void main(String[] args) {
        Display display = new Display();
        final Shell shell = new Shell(display);
        
        // INSTANCIA LABEL
        Label label = new Label(shell, SWT.WRAP);
        label.setText("Javaaaaaaaaaaaaaaaaaaaaaaaa!"); // TEXT OF LABEL
        
        // BOTOES
        Button button1 = new Button(shell, SWT.PUSH);
        button1.setText("Botao 1");
        Button button2 = new Button(shell, SWT.PUSH);
        button2.setText("Botao 2");

        
        // MONTA LAYOUT
        final int insetX = 4, insetY = 4; // ESPACO INTERNO
        FormLayout formLayout = new FormLayout();
        formLayout.marginWidth = insetX;
        formLayout.marginHeight = insetY;
        shell.setLayout(formLayout);

        // POSICAO E TAMANHO DO FORM
        Point size = label.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        final FormData labelData = new FormData(size.x, SWT.DEFAULT);
        labelData.left = new FormAttachment(0, 0);
        labelData.right = new FormAttachment(100, 0);
        label.setLayoutData(labelData);
        
        // MONTA ESPACO INTERNO
        shell.addListener(SWT.Resize, new Listener() {
          public void handleEvent(Event e) {
            Rectangle rect = shell.getClientArea();
            labelData.width = rect.width - insetX * 1;
            shell.layout();
          }
        });

        
        // MONTA BOTAO 2
        FormData button2Data = new FormData();
        button2Data.top = new FormAttachment(label, insetY);
        button2Data.right = new FormAttachment(100, -insetX);
        button2Data.bottom = new FormAttachment(100, 0);
        button2.setLayoutData(button2Data);

        // MONTA BOTAO 1
        FormData button1Data = new FormData();
        button2Data.top = new FormAttachment(label, insetY);
        button1Data.right = new FormAttachment(button2, -insetX);
        button1Data.bottom = new FormAttachment(100, 0);
        button1.setLayoutData(button1Data);
        

        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
          if (!display.readAndDispatch())
            display.sleep();
        }
        display.dispose();
    }
}                       
