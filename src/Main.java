import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	int randInt = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    	while(true){
    		Scanner input = new Scanner(System.in);
    		int userGuess;
    		System.out.println("Pick a number between 1 and 6");
    		userGuess = input.nextInt();
    		System.out.println("Pick again");
    		if(userGuess == randInt){
    			System.out.println("Congrats! You won");
    			break;
    		}
    	}
	}
}