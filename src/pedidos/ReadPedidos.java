package pedidos;

import java.io.*;

public class ReadPedidos {

	public static void main(String[] args) {
		// File file = new File(args[0]); // .....> c://Ale//hola.txt
		File file = new File("C:\\Users\\dcortina\\Desktop\\Curso\\ProyectosEclipse\\Ejercicios", "pedidos.txt"); // argumentos:
																													// PATH,
																													// NombredeArchivo

		try {
			FileReader f = new FileReader(file);
			System.out.println("encontre el archivo");
			// el FileReader, en sus metodos de read() devuelve un INPUTSTREAMREADER
			BufferedReader bf = new BufferedReader(f);
			// el BufferedReader tiene el metodo readLine() que devuelve un String

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader in = new BufferedReader(new FileReader(file)); // PATRON DECORATOR
			String s;
			s = in.readLine();
			while (s != null) {
				System.out.println("Read: " + s);
				s = in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e1) {
			System.err.println("File not found: " + file);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
