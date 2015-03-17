package unit2.yr2009;

public class MultiExceptionHandling {
	public static void main(String[] args) {
		String name = "Vijay";
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String is too small.");
		} catch (NullPointerException e) {
			System.out.println("Name can not be null.");
		}
	}

}
