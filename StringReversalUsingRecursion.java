package oceanOfCode;

public class StringReversalUsingRecursion {
	
	static String reverse(String str) {
		
		if (str == null || str.isEmpty()) {
			return "";
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AK";
		System.out.println(reverse(str));
	}

}
