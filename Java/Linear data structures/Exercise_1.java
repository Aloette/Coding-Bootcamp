public class Exercise_1 {

	static int[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};

	public static void main(String[] args) {

		// Calling getMin() method
		int min = getMin(array);
		System.out.println("Minimum value is: " +min);

		String pinakas="";
		for (int i=0; i<array.length; i++) {
			if (array[0] == min) {
				pinakas+= i + ", "; // edo kapos prepei na eksafanistei to teleftaio komma!
			}
		}

		System.out.println("The minimum value " + min + " can be found in the following positions: " + pinakas);

	}

	// Finding the minimum Value (minValue) of the array
	public static int getMin(int[] array){
		int minValue = array[0];
		for (int i=1; i<array.length; i++){
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}
}
