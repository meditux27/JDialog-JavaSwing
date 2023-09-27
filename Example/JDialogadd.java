package Example;
//Copiar codigo desde aqui
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class JDialogadd {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	// Crear un JFrame y estableciendo el titulo
        JFrame frame = new JFrame("Ejemplo de add() en JDialog");
     // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
        //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);
     // Hacer visible la ventana
        frame.setVisible(true);

        // Crear un diálogo modal
        JDialog dialog = new JDialog(frame, "Diálogo de Ejemplo", true);
     // Establecer el tamaño de JDialog
        dialog.setSize(300, 200);
      //Establece la posición inicial de JDialog
        dialog.setLocationRelativeTo(null);

        // Crear un botón y agregarlo al diálogo
        JButton button = new JButton("Boton dentro de JDialog");
        
        //Utiliza el metodo add() para agregar el boton al interior de JDialog
        dialog.add(button);

        // Mostrar el diálogo
        dialog.setVisible(true);
    }
}
