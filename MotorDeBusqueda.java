package proyectoEstructuras;

import java.io.File;
import java.util.ArrayList;

public class MotorDeBusqueda {

	public static class Main {

		public static int contador = 0;
		public static ArrayList<String> listaArchivos = new ArrayList();

		public static void mostrarLista() {

			for (String a : listaArchivos) {
				System.out.println(a);
			}
		}

		public static void buscarArchivos(File ruta) {
			File archivos[] = ruta.listFiles();
			if (archivos != null) {
				for (int i = 0; i < archivos.length; i++) {
					if (archivos[i].isDirectory()) {
						buscarArchivos(archivos[i]);
					} else if (archivos[i].getName().endsWith("docx")) {
						contador++;
						listaArchivos.add(archivos[i].getName());
					} else if (archivos[i].getName().endsWith("txt")) {
						contador++;
						listaArchivos.add(archivos[i].getName());
					} else if (archivos[i].getName().endsWith("pdf")) {
						contador++;
						listaArchivos.add(archivos[i].getName());
					}
				}
			}

		}

	}

}
