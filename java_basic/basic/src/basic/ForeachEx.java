package basic;

public class ForeachEx {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		String[] names = { "apple", "pair", "banana", "cherry", "grape" };
		int sum = 0;

		for (int k : num)
			sum += k;
		System.out.println(sum);

		for (String s : names)
			System.out.println(s + " ");
	}
}
