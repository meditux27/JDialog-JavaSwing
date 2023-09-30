package Example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JDialogsetLocationRelativeTo {
public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setSize(400,400);
	frame.setLayout(new FlowLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	JButton btn=new JButton("haz click");

	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JDialog dialog = new JDialog(frame, "Cuadro de diálogo de ejemplo", true);
            //Establece el tamaño de JDialog
            dialog.setSize(300, 200);
            //Establece la posición del componente JDialog , al utilizar null se posiciona en la parte central de la pantalla 
            dialog.setLocationRelativeTo(null);
            // Agregar un JLabel al JDialog
            JLabel label = new JLabel("Este es un cuadro de diálogo centrado");
            dialog.add(label);
            //Establece la visibilidad de JDialog, si se cambia a false simplemente no aparecera el cuadro de dialogo y parecera que no se ejecuta
            dialog.setVisible(true);
			
		}
	});
	frame.add(btn);
	frame.setVisible(true);
	
	
	
}
}
