package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogVisibilityExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("Ejemplo de setVisible en JDialog");
        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
      //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);

        //Creación del botón para mostrar JDialog
        JButton showDialogButton = new JButton("Mostrar Cuadro de Diálogo");

        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de JDialog con el JFrame como propietario
                JDialog dialog = new JDialog(frame, "Cuadro de Diálogo", true);

                // Configurar el tamaño del cuadro de diálogo
                dialog.setSize(200, 100);

                // Agregar un botón para cerrar el cuadro de diálogo
                JButton closeButton = new JButton("Cerrar");
                closeButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Ocultar el cuadro de diálogo cuando se hace clic en el botón "Cerrar"
                        dialog.setVisible(false);
                        
                    }
                });
                //Agrega el boton al JDialog
                dialog.add(closeButton);
                //Establece la posición inicial de la ventana al ejecutar 
                dialog.setLocationRelativeTo(null);
                // Hacer visible el cuadro de diálogo
                dialog.setVisible(true);
            }
        });

        frame.add(showDialogButton);
        frame.setVisible(true);
    }
}
