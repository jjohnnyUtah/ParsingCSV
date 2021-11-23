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
		Vector<String> company = new Vector<String>();
		Vector<String> job = new Vector<String>();
		Vector<String> location = new Vector<String>();
		Vector<String> employees = new Vector<String>();
		try {
			Scanner pippo = new Scanner(new BufferedReader(new FileReader("file.csv")));
			pippo.useDelimiter(","); //usa la virgola come elemento separatore
			//legge il file e lo formatta mettendo i vari token nei vetotri corrispondenti
				while(pippo.hasNext()) {
					company.add(pippo.next());
					job.add(pippo.next());
					location.add(pippo.next());
					employees.add(pippo.next());
				}
			System.out.println("%%%%%%%%%%%%%%%");
			System.out.println(" company list: " + company);
			System.out.println("    jobs list: " + job);
			System.out.println("location list: " + location);
			System.out.println("num.employees: " + employees);
			System.out.println("%%%%%%%%%%%%%%%");
			
			pippo.close();
		} catch(IOException e) {
			System.out.println("Errore");
			System.out.println(e);
		}
	}
}
