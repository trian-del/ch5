import java.util.Scanner;
public class Fermat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;) {
			System.out.println("enter numbers");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int n = s.nextInt();
			
			if(Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2){
				System.out.println("Holy smokes, Fermat was wrong!");
			} else System.out.println("No, that doesn’t work."); 
		}
	}
}
