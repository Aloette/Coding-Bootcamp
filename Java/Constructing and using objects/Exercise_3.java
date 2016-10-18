import java.util.*;

public class Exercise_3 {

	public static void main(String[] args){

	    int[] pinakas = new int[]{1,2,3,4,5,6,7,8,9,10};
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter a number for the times you wish to shift the array elements: ");
	    int num = reader.nextInt();
	    System.out.println(Arrays.toString(Shift(pinakas,num)));
	}

	public static int[] Shift(int[] x, int n){	// method (function) that can shift the array elements right by 10 times
	    int[] k = new int[10];
	    for (int j=0; j<=n; j++){
			for (int i=0; i<x.length; i++){
				if (i+1>=10){
					k[i+1-10]=x[i];
		        }
					else {
					    k[i+1]=x[i];
					}
			}
					for (int i=0; i<x.length; i++) {
					    x[i]=k[i];
					}
			}

			return k;
	}
}
