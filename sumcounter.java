package sumcounter;
import java.util.Scanner;
import java.util.Random;
public class sumcounter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int die1 = 0;
		int die2=0;
		int sum;
		System.out.print("How many pair of dice would you like to roll? ");
		int n = in.nextInt();
		int[] list= new int[13]; //creates an array to draw from (0-12)
		for (int k=0; k<=12; k++){
			list[k]=0; //initialize array for storage
		}
		for (int i=1; i<= n; i++){
			die1 = rand.nextInt(6)+1;
			die2 =rand.nextInt(6)+1;
			sum = die1+ die2;
			for (int j=2;j<=12; j++){
				if (sum==j)list[j]=list[j]+1;
			}
		}
		for (int l=2; l<=12; l++){
			System.out.print(l+": ");
			for (int m=1; m<=list[l]; m++){ //only marks if more than 1 match
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}	