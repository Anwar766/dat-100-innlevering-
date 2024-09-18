import java.util.Scanner;

public class OppgaveB6 {
	
	public static void main(String [ ]arg) {
		
		double [] grenser = {0, 208050, 292850, 670000, 937900,1350000};
		double [] satser = {0,0.017,0.04,0.134,0.166,0.176};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Skrive inn din bruttointekt ");
		double inntekt = scanner.nextDouble();
		scanner.close();
		
		double trinnskatt =0;
		
		for (int i = grenser.length -1 ;  i > 0; i--) {
			if( inntekt > grenser [i]) {
				trinnskatt +=(inntekt - grenser [i])* satser [i];
				inntekt = grenser [i];
			}
		}
		System.out.println("trinnnskatten din er "+trinnskatt);
	}

}
