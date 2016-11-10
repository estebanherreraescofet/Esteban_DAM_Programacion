import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiPerfilEstebanHerrera extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;

	/*
	 * Punto de entrada a la aplicación 
	 **/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfilEstebanHerrera frame = new MiPerfilEstebanHerrera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *Configuracion de la ventana
	 */
	public MiPerfilEstebanHerrera() {
		//Marco y contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta Nombre
		JLabel etiqueta = new JLabel("Nombre");
		etiqueta.setBounds(10, 11, 46, 14);
		contentPane.add(etiqueta);
		
		//Caja para nombre
		caja = new JTextField();
		caja.setText("Esteban");
		caja.setBounds(10, 36, 212, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		
		//Etiqueta Apellidos
		JLabel etiqueta1 = new JLabel("Apellido");
		etiqueta1.setBounds(10, 67, 46, 14);
		contentPane.add(etiqueta1);
		
		//Caja para apellidos
		caja1 = new JTextField();
		caja1.setText("Herrera");
		caja1.setColumns(10);
		caja1.setBounds(10, 92, 212, 20);
		contentPane.add(caja1);
		
		//Etiqueta Edad
		JLabel etiqueta2 = new JLabel("Edad");
		etiqueta2.setBounds(10, 123, 46, 14);
		contentPane.add(etiqueta2);
		
		//Caja para poner la edad
		caja2 = new JTextField();
		caja2.setText("24");
		caja2.setColumns(10);
		caja2.setBounds(10, 148, 212, 20);
		contentPane.add(caja2);
		
		//Etiqueta Email
		JLabel etiqueta3 = new JLabel("email");
		etiqueta3.setBounds(10, 179, 46, 14);
		contentPane.add(etiqueta3);
		
		//Caja para poner la direccion
		caja3 = new JTextField();
		caja3.setText("sfvll@gmail.com");
		caja3.setColumns(10);
		caja3.setBounds(10, 204, 212, 20);
		contentPane.add(caja3);
	}
}
