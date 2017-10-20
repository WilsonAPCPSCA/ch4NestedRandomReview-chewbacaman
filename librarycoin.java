package librarycoin;
import java.util.Scanner;
public class librarycoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many coins you want flipped? ");
		int n= in.nextInt();
		double c=0; //initialize the coin
		int count1 = 0; //heads
		int count2 = 0; //tails
		for (int i=0;  i<n; i++){
			c=Math.random();
			if((c>0)&&(c<=0.5)){
				System.out.print("T");
				count2++;
			}else if ((c>0.5)&&(c<=1)){
				System.out.print("H");
				count1++;
			}
		}
		System.out.println("");
		System.out.print("You have "+ count1 + " heads and " + count2 + " tails.");
	}

}
