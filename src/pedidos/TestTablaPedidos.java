package pedidos;

import java.io.*;
import java.util.*;

public class TestTablaPedidos {

	public static void main(String[] args) {

		String buf;
		FileReader fs = null;
		try {
			fs = new FileReader("C:\\Users\\dcortina\\Desktop\\Curso\\ProyectosEclipse\\Ejercicios\\tablaPedidos.csv");
		} catch (Exception e) {
			System.out.println("No es posible abrir Datos.csv");
			System.exit(1);
		}
		BufferedReader ds = new BufferedReader(fs);
		while (true) {
			try {
				buf = ds.readLine();
				if (buf == null)
					break;
			} catch (IOException e) {
				System.out.println("Error en lectura de archivo.");
				break;
			}
			StringTokenizer st = new StringTokenizer(buf, "+");
			if (buf == "Pedido") {
				System.out.println(st.nextToken());
			}
			String name = null;
			while (st.hasMoreTokens()) {
				name = st.nextToken().toString();
			}
			System.out.println("\n");
		}
		try {
			fs.close();
		} catch (IOException e) {
			System.out.println("Error detectado en cierre de archivo.");
		}
	}
}