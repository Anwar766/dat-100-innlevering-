import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
	 Scanner Scanner = new Scanner (System.in);
	 
	 
	 System.out.println("skrive inn heltall n > 0;");;
	 int n= Scanner.nextInt(); 
	 
	 if (n <= 0) {
		 System.out.println("heltall må være størrre en 0 ");
	 } else  {
		 long fakultet  = 1;
		 for(int i = 1; i <= n; i++) {
			 fakultet *=i;
			 
		 }
		 System.out.println("fakulteten er " + fakultet );
	 }

	}

}
