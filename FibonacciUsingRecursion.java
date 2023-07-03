package oceanOfCode;

public class FibonacciUsingRecursion {
	
	static int fibonacci(int n) throws Exception {
		if (n < 0) {
			throw new Exception("Invalid input");
		} else if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int n = 3;
		System.out.println(fibonacci(n));
	}

}
