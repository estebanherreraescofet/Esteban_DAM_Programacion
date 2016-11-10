import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BailandoTextoEstebanHerrera extends JFrame {

	private JPanel contentPane;
	private JTextField CampoTextoIzquierda;
	private JTextField CampoTextoDerecha;

	/*
	 * Punto de entrada a la aplicación 
	 **/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTextoEstebanHerrera frame = new BailandoTextoEstebanHerrera();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *Configuración de la ventana
	 */
	public BailandoTextoEstebanHerrera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Caja de texto de la izquierda
		CampoTextoIzquierda = new JTextField();
		CampoTextoIzquierda.setBounds(24, 120, 86, 20);
		contentPane.add(CampoTextoIzquierda);
		CampoTextoIzquierda.setColumns(10);
		
		//Caja de texto de la derecha
		CampoTextoDerecha = new JTextField();
		CampoTextoDerecha.setColumns(10);
		CampoTextoDerecha.setBounds(318, 120, 86, 20);
		contentPane.add(CampoTextoDerecha);
		
		//Boton1
		JButton boton1 = new JButton("-->");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Si se apreta pasa el texto de caja izquierda a caja derecha
				CampoTextoDerecha.setText(CampoTextoIzquierda.getText());
				//Deja en blanco el de la izquierda
				CampoTextoIzquierda.setText("");
			}
		});
				
		boton1.setBounds(171, 45, 89, 23);
		contentPane.add(boton1);
		
		//Boton 2
		JButton boton2 = new JButton("<--");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Si se apreta pasa el texto de caja derecha a izquierda
				CampoTextoIzquierda.setText(CampoTextoDerecha.getText());
				//Deja en blanco el de la derecha
				CampoTextoDerecha.setText("");
			}
		});
		boton2.setBounds(171, 191, 89, 23);
		contentPane.add(boton2);
		
	}
}
