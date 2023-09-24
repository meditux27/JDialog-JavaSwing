package Example;
//Copiar codigo desde aqui
import javax.swing.*;

import java.awt.Dialog.ModalityType;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogsetModalityType {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Ejemplo de setDefaultCloseOperation");
     // Crear un JFrame y estableciendo el titulo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
     // Establece la posición incial al ejecutar 
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
       
   
       JButton showDialogButtonA = new JButton("APPLICATION_MODAL");
       

        showDialogButtonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog = new JDialog(frame,"APPLICATION_MODAL" );
                
                //Estableciendo el comportamiento modal 
                dialog.setModalityType(ModalityType.APPLICATION_MODAL);
                dialog.setSize(200, 200);
                //El JDialog se ubican en relación a frame
                dialog.setLocationRelativeTo(frame);
                //El diálogo se cierra y se destruye
                dialog.add(new JLabel("Dialog.ModalityType.APPLICATION_MODAL"));
                dialog.setVisible(true);
                
            }
        });

        JButton showDialogButtonD = new JButton("DOCUMENT_MODAL");
        

        showDialogButtonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog2 = new JDialog(frame,"DOCUMENT_MODAL" );
                //Estableciendo el comportamiento modal 
                dialog2.setModalityType(ModalityType.DOCUMENT_MODAL);
                dialog2.setSize(200, 200);
                // Hacer visible el cuadro de diálogo
                
                //El JDialog se ubican en relación a frame
                dialog2.setLocationRelativeTo(frame);
                //El diálogo se cierra y se destruye
                
                dialog2.add(new JLabel("Dialog.ModalityType.DOCUMENT_MODAL"));
                dialog2.setVisible(true);
                
                
            }
        });
        
  JButton showDialogButtonM = new JButton("MODELESS");
        

        showDialogButtonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog3 = new JDialog(frame,"MODELESS" );
                //Estableciendo el comportamiento modal 
                dialog3.setModalityType(ModalityType.MODELESS);
                dialog3.setSize(200, 200);
                // Hacer visible el cuadro de diálogo
                
                //El JDialog se ubican en relación a frame
                dialog3.setLocationRelativeTo(frame);
                //El diálogo se cierra y se destruye
                
                dialog3.add(new JLabel("Dialog.ModalityType.MODELESS"));
                dialog3.setVisible(true);
                
                
            }
        });
        frame.add(showDialogButtonA);
        frame.add(showDialogButtonD);
        frame.add(showDialogButtonM);
        
        frame.setVisible(true);
        
    }
}
