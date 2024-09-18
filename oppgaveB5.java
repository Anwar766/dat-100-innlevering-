import java.util.Scanner;

public class oppgaveB5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		for (int i= 1; i <= 10; i++) {
			System.out.println("skrive poengsum: "+ i +".");
			int score =scanner.nextInt();
		
		
		if ( score < 0||score > 100) {
			System.out.println("ugyldig poengsum, velg tall mellom 0-100 :)");
		}else if (score >= 90){
			System.out.println("karakter A!");
			
		}else if (score>= 80){
			System.out.println("karakter B!");
		 
		}else if (score>= 70){
			System.out.println("karakter C!");
			
		}else if (score >= 60){
			System.out.println("karakter D!");
			
		}else if (score >= 50){
			System.out.println("karakter E!");
			
		}else {
			System.out.println("karakter F");
			

	}

}
	

scanner.close();
}

}