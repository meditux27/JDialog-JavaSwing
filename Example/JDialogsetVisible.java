package Example;
//Copiar codigo desde aqui
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogsetVisible {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	// Crear un JFrame y estableciendo el titulo
    	JFrame frame = new JFrame("Ejemplo setVisible");
    	// Establecer el tamaño de frame
        frame.setSize(300, 200);
     // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Establece la posición inicial
        frame.setLocationRelativeTo(null);
      //Establece el manejador de estilo
        frame.setLayout(new FlowLayout());
        

        // Crear un botón que abrirá el JDialog
        JButton openDialogButton = new JButton("Abrir JDialog");
        openDialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear un JDialog
                JDialog dialog = new JDialog(frame, "Mi JDialog", true); // El tercer argumento es para hacerlo modal
                dialog.setSize(200, 100);
                dialog.setLayout(new FlowLayout());
                dialog.setLocationRelativeTo(frame);

                // Agregar un botón al JDialog
                JButton closeButton = new JButton("Ocultar");
                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                    	// cambiar el parametro setVisible cuando se hace clic en el botón de Cerrar
                        dialog.setVisible(false);
                       
                        //liberar recursos despues de retirar la visibilidad del JDialog
                        dialog.dispose();
                    }
                });

                dialog.add(closeButton);

                // Hacer visible el JDialog
                dialog.setVisible(true);
            }
        });

        frame.add(openDialogButton);
        frame.setVisible(true);
    }
}
