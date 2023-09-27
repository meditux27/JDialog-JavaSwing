package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JDialogdispose {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
	public static void main(String[] args) {
		// Crear un JFrame y estableciendo el titulo
        JFrame frame = new JFrame("Ejemplo de Dispose en JDialog");
     // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(300, 200);
      //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);
      //Establece un manejador de posicionamiento de componentes , para que se coloque el boton de manera centrada
        frame.setLayout(new FlowLayout());

        JButton showDialogButton = new JButton("Mostrar Diálogo");
        //Agrega el boton a frame
        frame.add(showDialogButton);
     // Hacer visible la ventana
        frame.setVisible(true);

        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo JDialog
                JDialog dialog = new JDialog(frame, "Diálogo de Ejemplo", true);
                dialog.setSize(250, 100);
                dialog.setLayout(new FlowLayout());

                JLabel label = new JLabel("Este es un diálogo de ejemplo.");
                dialog.add(label);

                JButton closeButton = new JButton("Cerrar");
                dialog.add(closeButton);

                closeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Cierra el diálogo y libera sus recursos
                        dialog.dispose();
                    }
                });

                // Mostrar el diálogo
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                
            }
        });
    }
}
