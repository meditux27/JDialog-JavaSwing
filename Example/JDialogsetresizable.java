package Example;
//Copiar codigo desde aqui
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogsetresizable {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Ejemplo de setDefaultCloseOperation");
     // Crear un JFrame y estableciendo el titulo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
     // Establece la posición incial al ejecutar 
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
       
   
       JButton showDialogButtonA = new JButton("Resizable Activo");
       

        showDialogButtonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog = new JDialog(frame,"JDialog" );

                dialog.setSize(200, 200);
                dialog.setVisible(true);
                //El JDialog se ubican en relación a frame
                dialog.setLocationRelativeTo(frame);
                //El diálogo se cierra y se destruye
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.add(new JLabel("Resizable Activado"));
                dialog.setResizable(true);
                
            }
        });

        JButton showDialogButtonD = new JButton("Resizable Desactivo");
        

        showDialogButtonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog2 = new JDialog(frame,"JDialog" );

                dialog2.setSize(200, 200);
                // Hacer visible el cuadro de diálogo
                dialog2.setVisible(true);
                //El JDialog se ubican en relación a frame
                dialog2.setLocationRelativeTo(frame);
                //El diálogo se cierra y se destruye
                dialog2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog2.add(new JLabel("Resizable Desactivado"));
                dialog2.setResizable(false);
                
            }
        });
        frame.add(showDialogButtonA);
        frame.add(showDialogButtonD);
        
        frame.setVisible(true);
        
    }
}
