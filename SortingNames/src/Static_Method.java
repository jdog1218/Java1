public class Static_Method {
	public static void SortNames(String[] names) {
		String temp;

		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[j].compareTo(names[i]) < 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
	}
}