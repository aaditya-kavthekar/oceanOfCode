package oceanOfCode;

public class StringLengthUsingRecursion {

	static int findLength(String str) {
		
		if (str == null || str.isEmpty()) {
			return 0;
		}
		
		return findLength(str.substring(1)) + 1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AK";
		System.out.println(findLength(str));
	}

}
