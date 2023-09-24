package Example;
//Copiar codigo desde aqui
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogBorderLayout {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Ejemplo de setDefaultCloseOperation");
     // Crear un JFrame y estableciendo el titulo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
     // Establece la posición incial al ejecutar 
        frame.setLocationRelativeTo(null);
       
        JButton btn=new JButton("NORTE");
        JButton btn2=new JButton("SUR");
        JButton btn3=new JButton("ESTE");
        JButton btn4=new JButton("OESTE");
        JButton btn5=new JButton("CENTRO");
       JButton showDialogButton = new JButton("Mostrar Cuadro de Diálogo");
       

        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog = new JDialog(frame,"JDialog" ,false);

                //Establece el tipo de layout manager 
                
                dialog.setLayout(new BorderLayout());
                
                //Agrega botones y dirección de los mismos
                                           
                dialog.add(btn, BorderLayout.NORTH);
                dialog.add(btn2, BorderLayout.SOUTH);
                dialog.add(btn3, BorderLayout.EAST);
                dialog.add(btn4, BorderLayout.WEST);
                dialog.add(btn5, BorderLayout.CENTER);
                
                dialog.setSize(400, 400);
                // Hacer visible el cuadro de diálogo
                dialog.setVisible(true);
                //El JDialog se ubican en relación a frame
                dialog.setLocationRelativeTo(frame);
                //El diálogo se cierra y se destruye
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
               
                
            }
        });

        frame.add(showDialogButton);
        frame.setVisible(true);
        
    }
}
