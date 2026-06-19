package generics;

public class PairedDriver {

	public static void main(String[] args) {

		PairedGenerics<String, Integer> p1 = new PairedGenerics<>("Age", 21);

//		System.out.println(p1.getKey());
//		System.out.println(p1.getValue());

		String key = p1.getKey();
		int value = p1.getValue();

		System.out.println(key + " : " + value);

	}
}
