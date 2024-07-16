
public class PracticalWork3 {

	public static void main(String[] args) {
		int[] array = { 8, 2, 0, -9, 45, -75, 21, 6, -7, 32, -12 };
		int answer = oddEvenMultiply(array);
		System.out
				.println("The multiplication of even element sum and odd element sum in this array is " + answer + ".");

	}

	protected static int oddEvenMultiply(int[] array) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenSum += array[i];
			} else {
				oddSum += array[i];
			}
		}
		int answer = evenSum * oddSum;
		return answer;
	}

}
