package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogpack {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Ejemplo de setDefaultCloseOperation");
     // Crear un JFrame y estableciendo el titulo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
     // Establece la posición incial al ejecutar 
        frame.setLocationRelativeTo(null);
       
        JLabel label=new JLabel("Agregando texto");
       JButton showDialogButton = new JButton("Mostrar Cuadro de Diálogo");
       

        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog = new JDialog(frame,"JDialog" ,false);

                //Agrega la etiqueta al interior de JDialog
                dialog.add(label);
                
                //Agregando el metodo pack el redimensionado de la ventana
                dialog.pack();
              
                                                            
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
