import java.util.Arrays;

public class SUM {
	private static boolean sum(int[] arr, int k) {
		Arrays.sort(arr);
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == k)
				return true;
			else if (sum < k)
				start++;
			else
				end--;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("RESULTAT EST :  => " + sum(new int[] { 1, 2, 3, 6 }, 3));
	}
}
