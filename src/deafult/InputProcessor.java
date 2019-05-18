import java.util.Scanner;

public class InputProcessor {

	public static int[] GetArrayFromInput() {
		int[] array = null;
		
		System.out.println("Enter the number of elements in the array");
		Scanner scanner = new Scanner(System.in);
		int numberElements = scanner.nextInt();
		array = new int[numberElements];
		for(int index = 0; index < numberElements; index++) {
			System.out.println("Enter the element:"+index);
			array[index] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}
}
