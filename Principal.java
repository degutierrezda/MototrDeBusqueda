package proyectoEstructuras;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		
		
		//interfaz grafica
		interfazGrafica ventana = new interfazGrafica();
		ventana.setBounds(0, 0, 380, 480);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		
		//motor de busqueda
		MotorDeBusqueda.Main.buscarArchivos(new File("C:/Users/Daza-PC/Desktop/bigData"));
		MotorDeBusqueda.Main.mostrarLista();
		System.out.println("Se han encontrado "  + " archivos.");

	}

}
