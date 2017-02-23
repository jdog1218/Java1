public class Drive {
	public static void main(String[] args) {
		String[] names = { "garret", "joel", "kevin", "brown", "roy", "karen", "shannon" };
		System.out.println("Before");
		for (String x : names) {
			System.out.println(x);
		}
		Static_Method.SortNames(names);
		System.out.println("After");
		for (String x : names) {
			System.out.println(x);
		}
	}
}