package prob1;

public class Prob1 {

	public static void main(String[] args) {
		int[] arr = {4, 7, 2, 9, 1};
		int maxDif = findMaxDifference(arr);
		System.out.println(maxDif);
	}
	
	public static int findMaxDifference(int[] numbers) {
		if (numbers.length < 2) {
			return 0;
		}
		
		int maxDif = 0;
		
		for (int i = 0; i < numbers.length - 1; i++) {
			int newDif = numbers[i] - numbers[i + 1];
			if (newDif < 0) {
				newDif*=-1;
			}
			if (newDif > maxDif) {
				maxDif = newDif;
			}
		}
		
		return maxDif;
		
	}

}
