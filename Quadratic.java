import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;){
			System.out.println("Input a, b and c values of a quadratic equation");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if(a==0) System.out.println("Invalid value of a");
			else if(Math.pow(b, 2)-4*a*c<0) System.out.println("Invalid equation");
			else {
				double r  = Math.sqrt(Math.pow(b, 2)-4*a*c);
				double ax = (-b+r)/2*a;
				double bx = (-b-r)/2*a;
				if(ax==bx) System.out.println("x = " + ax);
				else System.out.println("x = "+ax+", "+bx);
			}
		}
	}
}
