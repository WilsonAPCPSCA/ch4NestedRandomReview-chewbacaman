
package diamond;
import java.util.Scanner;
public class diamond {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the sidelength of your diamond? ");
		int n = in.nextInt();
		for(int i=1; i<= n; i++){//each top layer
			for(int k=(n-i);k >=0; k--){
				System.out.print(" ");//left side spaces
			}
			for (int j=1; j<= (2*i-1); j++){//diamonds per row
				System.out.print("*");
			}
		System.out.println("");
		}//top half
		for(int i=(n-1); i >= 1; i--){
			for(int k=(n-i);k >=0; k--){
				System.out.print(" ");
			}
			for (int j=1; j<= (2*i-1); j++){
				System.out.print("*");
			}
		System.out.println("");
		}//bottom half

	}

}
