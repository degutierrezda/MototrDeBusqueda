package proyectoEstructuras;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class interfazGrafica extends JFrame implements ActionListener {

	private JTextField textfield;
	private JTextArea textarea;
	private JLabel texto1, texto2, texto3;
	private JButton boton1;
	private JScrollPane scrollpanel;

	String texto = "";

	// ventana
	public interfazGrafica() {
		setLayout(null);
		setTitle("Buscador Local");
		getContentPane().setBackground(new Color(88, 88, 88));

		// textos de la ventana
		texto1 = new JLabel("Ingrese el lugar de su busqueda. Ej: C:/ ");
		texto1.setBounds(25, 110, 310, 100);
		texto1.setForeground(new Color(255, 255, 255));
		add(texto1);

		// casilla de texto
		textfield = new JTextField();
		textfield.setBounds(25, 170, 150, 30);
		add(textfield);

		// caracteristicas del boton.
		setLayout(null);
		boton1 = new JButton("Buscar");
		boton1.setBounds(25, 205, 100, 30);
		add(boton1);
		boton1.addActionListener(this);

		// Pantalla donde se imprime.
		textarea = new JTextArea();
		scrollpanel = new JScrollPane(textarea);
		scrollpanel.setBounds(25, 240, 325, 180);
		add(scrollpanel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1)
			;
		texto += textfield.getText() + "\n";
		textarea.setText(texto);
		textfield.setText("");
	}

}