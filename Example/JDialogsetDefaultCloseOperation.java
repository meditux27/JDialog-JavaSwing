package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogsetDefaultCloseOperation {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Ejemplo de setDefaultCloseOperation");
     // Crear un JFrame y estableciendo el titulo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
     // Establece la posición incial al ejecutar 
        frame.setLocationRelativeTo(null);
        
       JButton showDialogButton = new JButton("Mostrar Cuadro de Diálogo");

        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog = new JDialog(frame, "Cuadro de Diálogo", false);

                // Configurar el tamaño del cuadro de diálogo
                dialog.setSize(200, 100);

                // Agregar un botón para cerrar el cuadro de diálogo
                JButton closeButton = new JButton("Cerrar");
                //Establece el comportamiento al presionar el botón
                closeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Ocultar el cuadro de diálogo cuando se hace clic en el botón "Cerrar"
                    	dialog.setVisible(false);
                       
                    }
                });
                //Agregaga el botón al cuadro de dialogo
                dialog.add(closeButton);
                // Hacer visible el cuadro de diálogo
                dialog.setVisible(true);
                //Agregando JDialog.DO_NOTHING_ON_CLOSE esto indica que no debe funcionar el botón de cerrar de la ventana
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                
                dialog.setLocationRelativeTo(frame);
                
            }
        });

        frame.add(showDialogButton);
        frame.setVisible(true);
    }
}
