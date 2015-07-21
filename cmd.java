package algoritmo;

import java.io.*;


public class Cmd {
	
	public void comandosUnix( int from, int to  ) {


		try {

			String s = null;
			String com = "curl ";
			String sat = "ftp://ftp2.sat.gob.mx/agti_ftp/cfds_ftp/CSD.txt";
			String setencia = "-range" + " " + from + "-" + to + " " + sat;
			String comando = com;
     	
			Process p = Runtime.getRuntime().exec(comando + sat);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// Leemos la salida del comando
			System.out.println(" Mensaje De Consola:\n");
			
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}

			// System.exit(0);
		} catch (IOException e) {
			System.out.println("Excepción: ");
			e.printStackTrace();
			System.exit(-1);
		}
	}			
	public  void comandoWindows(int from, int to) {
		try {
			String s = null;
			String com = "C:\\Program Files (x86)\\Git\\bin\\curl ";
			String sat = "ftp://ftp2.sat.gob.mx/agti_ftp/cfds_ftp/CSD.txt";
			String setencia = "-range" + " " + from + "-" + to + " " + sat;
			String comando = com;
     	
			Process p = Runtime.getRuntime().exec(comando + sat);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// Leemos la salida del comando
			System.out.println(" Mensaje De Consola:\n");
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}

			// System.exit(0);
		} catch (IOException e) {
			System.out.println("Excepción: ");
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
