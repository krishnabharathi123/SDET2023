
public class TestClass {

	public static void main(String[] args) {
		String address1="1.1.1.1";
		String[] split = address1.split("[.]");
		for (String string : split) {
			System.out.println(string);
		}

	}

}
