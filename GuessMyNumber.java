import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
	
    public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
		for(;;) {
			int wrong=0;
			int n = r.nextInt(100) + 1;
			System.out.println("Guess a number between 1 and 100");
			for(;;) {
				int guess = s.nextInt();
				if
				if(guess<n) {
					System.out.println("Higher");
					wrong++;
				}
				if(guess>n) {
					System.out.println("Lower");
					wrong++;
				}
				if(guess==n) {
					System.out.println("You guessed the number");
					break;
				}
				if(wrong==3) {
					System.out.println("The number was "+n);
					break;
				}
			}
			
		}
    }
}
