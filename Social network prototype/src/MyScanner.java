import java.util.Scanner;

public class MyScanner {
	private String zwischenspeicher;
	private Scanner sc;
	
	public MyScanner() {
		sc = new Scanner(System.in);	
	}
	
	public String nextinput() {
		zwischenspeicher = sc.nextLine();	
		return zwischenspeicher; 
	}
	
}
