/**
 * 
 */
package src;

/**
 * @author Zulli
 *
 */
import java.io.*;
import java.util.Scanner;
import java.util.Vector;
public class Main {
	//Vector<String> v = new Vector<String>();
	public static void main(String[] args) {
		String line="";
		Vector<String> company = new Vector<String>();
		Vector<String> job = new Vector<String>();
		Vector<String> location = new Vector<String>();
		Vector<String> employees = new Vector<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.csv"));
			//legge il file e lo formatta mettendo i vari token nei vetotri corrispondenti
				while((line = br.readLine()) != null) {
					String[] values = line.split(","); //usa la virgola come elemento separatore
					company.add(values[0]);
					job.add(values[1]);
					location.add(values[2]);
					employees.add(values[3]);

				}
			System.out.println("%%%%%%%%%%%%%%%");
			System.out.println(" company list: " + company);
			System.out.println("    jobs list: " + job);
			System.out.println("location list: " + location);
			System.out.println("num.employees: " + employees);
			System.out.println("%%%%%%%%%%%%%%%");
			
			br.close();
		} catch(IOException e) {
			System.out.println("Errore");
			System.out.println(e);
		}
	}
}
