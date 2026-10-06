import java.util.Scanner;
public class Triangle {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;) {
			System.out.println("Input lengths");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println(calc(a,b,c));
		}
	}
	
	public static String calc(int a, int b,  int c) {
		String p = "Possible";
		if(a>b+c) p = "Not possible";
		else if(b>a+c) p = "Not possible";
		else if(c>a+b) p = "Not possible";
		return p;
	}
} 
