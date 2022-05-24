package pedidos;

import java.io.*;
import java.util.StringTokenizer;

public class EjercicioCSV {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\dcortina\\Desktop\\Curso\\ProyectosEclipse\\Ejercicios", "pedidos.txt");

		File newFile = new File("C:\\Users\\dcortina\\Desktop\\Curso\\ProyectosEclipse\\Ejercicios",
				"tablaPedidos.csv");

		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			PrintWriter out = new PrintWriter(new FileWriter(newFile));

			out.print("Pedido;");
			out.print("Bolson;");
			out.print("Huevos x30;");
			out.print("Pedido Kiwi;");
			out.println();

			String order;

			order = in.readLine();

			while (order != null) {

				out.print(order + ";");

				String article = null;
				String bolson = "";
				String huevos = "";
				String kiwi = "";

				StringTokenizer st = new StringTokenizer(order, "+");

				while (st.hasMoreTokens()) {

					article = st.nextToken().toString();

					String articleAmount = "";
					StringTokenizer st2 = new StringTokenizer(article, " ");
					articleAmount = st2.nextToken();

					if (article.indexOf("Bolson") > 1) {
						bolson = articleAmount;
					}

					if (article.indexOf("Huevos") > 1) {
						huevos = articleAmount;
					}

					if (article.indexOf("Kiwi") > 1) {
						kiwi = articleAmount;
					}

				}

				out.print(bolson + ";" + huevos + ";" + kiwi + ";");

				out.println();

				order = in.readLine();

			}

			in.close();
			out.close();

		} catch (FileNotFoundException e1) {
			System.err.println("File not found: " + file);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
