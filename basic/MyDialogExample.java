package basic;
//Copiar codigo desde aqui
import javax.swing.*;

public class MyDialogExample {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	// Crear un JFrame y estableciendo el titulo
    	JFrame frame = new JFrame("Ejemplo de JDialog");
        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);
        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);

        JButton showDialogButton = new JButton("Mostrar cuadro de diálogo");
        showDialogButton.addActionListener(e -> {
            // Crear un JDialog
            JDialog dialog = new JDialog(frame, "Cuadro de diálogo de ejemplo", true);
            //Establece el tamaño de JDialog
            dialog.setSize(300, 200);
            //Establece el tamaño de JDialog
            dialog.setLocationRelativeTo(null);
            // Agregar un JLabel al JDialog
            JLabel label = new JLabel("Este es un cuadro de diálogo de ejemplo.");
            dialog.add(label);

            // Hacer visible el JDialog
            dialog.setVisible(true);
            
        });

        frame.add(showDialogButton);
        frame.setVisible(true);
    }
}
