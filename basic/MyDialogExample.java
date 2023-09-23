package basic;

import javax.swing.*;

public class MyDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JDialog");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton showDialogButton = new JButton("Mostrar cuadro de diálogo");
        showDialogButton.addActionListener(e -> {
            // Crear un JDialog
            JDialog dialog = new JDialog(frame, "Cuadro de diálogo de ejemplo", true);
            dialog.setSize(300, 200);
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
