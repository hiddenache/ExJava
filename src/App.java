import java.io.*;
import java.util.Random;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {


		// EXERCITIUL 1
		/*int latime, lungime;
		BufferedReader read;
		read = new BufferedReader(new InputStreamReader(System.in));

		latime = Integer.parseInt(read.readLine());

		lungime = Integer.parseInt(read.readLine());

		int arie, perimetru;

		arie = latime *lungime;
		perimetru = 2*(latime+lungime);

		System.out.println("Arie: " + arie);
		System.out.println("Perimetru: " + perimetru);*/

		// EXERCITIUL 2
		/*int suma = 0;
		float mediaAritmetica = 0;
		int valMinima = Integer.MAX_VALUE, valMaxima= Integer.MIN_VALUE;

		BufferedReader read;
		read = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));

		String line;
		int count = 0;


		while((line = read.readLine()) != null) {
			for(int i=0; i<line.length(); i++) {
				count++;
				suma += Integer.parseInt(line); 
				mediaAritmetica = (float)suma / count;
				//smallest = Integer.parseInt(read.readLine());

				int val = Integer.parseInt(line);
				if(val < valMinima) {
					valMinima = val;
				}

				if(val > valMaxima) {
					valMaxima = val;
				}
			}
		}

		// scriere in fisier

		PrintStream scriere = new PrintStream("out.txt");

		scriere.print("Suma: "+ suma);
		scriere.print("\n");
		scriere.print("MA: "+ mediaAritmetica);
		scriere.print("\n");
		scriere.print("valMinima: "+ valMinima);
		scriere.print("\n");
		scriere.print("valMAxima: "+ valMaxima);

		System.out.println("Suma: " + suma);
		System.out.println("Medie Aritmetica: " + mediaAritmetica);
		System.out.println("Valoare minima: " + valMinima);
		System.out.println("Valoare maxima: " + valMaxima);
		 */
		
		//EXERCITIUL 3
		
		/*int n;
		int i;
		
		System.out.println("N=");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(read.readLine());

		for(i = 1; i <= n; i++) {
			if(n%2 != 0) {
				System.out.println("prim");
				break;
			}
			
			if(n%i == 0) {
				System.out.print(i + " ");
			}
	
		}*/
		
		//EXERCITIUL 4

		/*Random random = new Random();
		int max = 30;
		int cmmdc;
		
		int nr1 = random.nextInt(max);
		int nr2 = random.nextInt(max);
		
		System.out.println(nr1);
		System.out.println(nr2);
		
		while(nr1 != nr2) {
			if(nr1 > nr2) {
				nr1 = nr1 - nr2;
			}
			else {
				nr2 = nr2 - nr1;
			}
		}
		
		System.out.println("CMMDC: " + nr1);*/
		
		//EXERCITIUL 5
		
		int n;
		Random random = new Random();
		n = random.nextInt(20);
		System.out.println(n);
		
		if(square(5*n*n+4) || square(5*n*n-4)) {
			System.out.println(n + " este fib");
		}
	}
	
	static boolean square(int x) {
		int s = (int)Math.sqrt(x);
		return (s*s == x);
	}

}
